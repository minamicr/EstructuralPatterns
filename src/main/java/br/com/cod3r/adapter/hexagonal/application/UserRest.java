package br.com.cod3r.adapter.hexagonal.application;

import br.com.cod3r.adapter.hexagonal.core.usecases.UserService;
import br.com.cod3r.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;
import br.com.cod3r.adapter.hexagonal.core.model.User;
import java.util.Map;

public class UserRest {
	private UserService service;
	private UserMemoryDatabaseAdapter database;
	
	public UserRest() {
		database = new UserMemoryDatabaseAdapter();
		service = new UserService(database);
	}

	public Integer post(Map<String, String> values) {
		String name = values.get("name");
		String email = values.get("email");
		String password = values.get("password");

		User user = new User(name, email, password);
		service.save(user);

		return 201;
	}
	
	public Integer get() {
		service.getAll();
		return 200;
	}
}
