package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDao;
import br.com.cod3r.bridge.mvc.model.User;

public abstract class UserService {
  UserDao userDao;

  public UserService(UserDao userDao) {
    this.userDao = userDao;
  }

  public abstract void save(User user);

}
