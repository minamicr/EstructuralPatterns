package br.com.cod3r.adapter.hexagonal.core.usecases;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import java.util.List;

public class UserService {
  UserRepository userRepository;

  public UserService(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  public void save(User user){
    System.out.println("Verificando se o usuário existe");
    boolean userExists = userRepository.getAll().stream()
        .anyMatch(us -> us.getEmail().equalsIgnoreCase(user.getEmail()));

    if(userExists) throw new RuntimeException("Usuário já existe");

    userRepository.save(user);
  }

  public List<User> getAll(){
    return userRepository.getAll();
  }
}
