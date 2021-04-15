package br.com.cod3r.bridge.mvc;

import br.com.cod3r.bridge.mvc.dao.UserDao;
import br.com.cod3r.bridge.mvc.dao.UserMongoDao;
import br.com.cod3r.bridge.mvc.dao.UserMysqlDao;
import br.com.cod3r.bridge.mvc.dao.UserOracleDao;
import br.com.cod3r.bridge.mvc.dao.UserPostgresDao;
import br.com.cod3r.bridge.mvc.model.User;
import br.com.cod3r.bridge.mvc.services.UserEJB;
import br.com.cod3r.bridge.mvc.services.UserRest;
import br.com.cod3r.bridge.mvc.services.UserService;
import br.com.cod3r.bridge.mvc.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserDao mongo = new UserMongoDao();
		UserService userEJB = new UserEJB(mongo);
		userEJB.save(user);

		UserDao mysql = new UserMysqlDao();
		UserService userRest = new UserRest(mysql);
		userRest.save(user);

		UserOracleDao oracle = new UserOracleDao();
		UserService userRest1 = new UserRest(oracle);
		userRest1.save(user);

		UserPostgresDao postgres = new UserPostgresDao();
		UserService userSoap = new UserSoap(postgres);
		userSoap.save(user);
		
	}
}
