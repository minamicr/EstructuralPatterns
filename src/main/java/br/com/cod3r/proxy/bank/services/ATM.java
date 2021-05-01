package br.com.cod3r.proxy.bank.services;

import br.com.cod3r.proxy.bank.model.User;

public class ATM implements BankOperations{
  BankOperations bank;

  public ATM(BankOperations bank){
    this.bank = bank;
  }

  @Override
  public void deposit(Long account, Long amount) {
    System.out.println("ATM proxy sending deposit to bank");
    bank.deposit(account, amount);
  }

  @Override
  public void withdraw(Long account, String passwd, Long amount) {
    if (amount > 300){
      System.out.println(String.format("%s it´s not allowed withdraw over 300 at ATM", getUserAccount(account)));
    } else {
      System.out.println("ATM proxy sending withdraw to bank");
      bank.withdraw(account, passwd, amount);
    }

  }

  @Override
  public void changePassword(Long account, String oldPassword, String newPassword) {
    System.out.println(String.format("%s you must go to the bank in order to change your password", getUserAccount(account)));

  }

  @Override
  public String getUserAccount(Long account) {
    return bank.getUserAccount(account);
  }
}
