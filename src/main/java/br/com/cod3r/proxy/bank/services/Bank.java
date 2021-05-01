package br.com.cod3r.proxy.bank.services;

import java.util.HashMap;
import java.util.Map;

import br.com.cod3r.proxy.bank.model.User;

public class Bank implements BankOperations {
	private Map<Long, User> userDatabase;
	
	public Bank() {
		userDatabase = new HashMap<Long, User>();
		userDatabase.put(123L, new User("João", 123L, "1234", 1000L));
		userDatabase.put(456L, new User("Manoel", 456L, "9999", 200L));
	}

	public String getUserAccount(Long account){
		return userDatabase.get(account).getName();
	}

	@Override
	public void deposit(Long account, Long amount) {
		User user = userDatabase.get(account);
		Long balance = user.getBalance();

		if(user == null) {
			System.out.println("DEPOSIT: Invalid account");
			return;
		}
		user.setBalance(user.getBalance() + amount);
		System.out.println(String.format("%s -> DEPOSIT (balance %d): +%d. New Balance: %d",
				user.getName(), balance, amount, user.getBalance()));
	}

	@Override
	public void withdraw(Long account, String passwd, Long amount) {
		User user = userDatabase.get(account);
		Long balance = user.getBalance();

		if(user == null) {
			System.out.println(String.format("%s -> WITHDRAW: invalid account", user.getName()));
			return;
		}
		if(!user.getPassword().equals(passwd)) {
			System.out.println(String.format("%s -> WITHDRAW (password %s): wrong password (correct %s)", user.getName(), passwd, user.getPassword()));
			return;
		}
		if(user.getBalance() < amount) {
			System.out.println(String.format("%s -> WITHDRAW %d: you don't have enough resources (balance %d)", user.getName(), amount, user.getBalance()));
			return;
		}
		user.setBalance(user.getBalance() - amount);
		System.out.println(String.format("%s -> WITHDRAW (balance %d): -%d. New Balance: %d",
				user.getName(), balance, amount, user.getBalance()));
	}

	@Override
	public void changePassword(Long account, String oldPassword, String newPassword) {
		User user = userDatabase.get(account);
		if(user == null) {
			System.out.println(String.format("%s -> PASSWORD: invalid account", user.getName()));
			return;
		}
		if(!user.getPassword().equals(oldPassword)) {
			System.out.println(String.format("%s -> PASSWORD %s: wrong password (correct: %s)", user.getName(), oldPassword, user.getPassword()));
			return;
		}
		user.setPassword(newPassword);
		System.out.println(String.format("%s's password updated successfuly!", 
				user.getName()));
	}

}
