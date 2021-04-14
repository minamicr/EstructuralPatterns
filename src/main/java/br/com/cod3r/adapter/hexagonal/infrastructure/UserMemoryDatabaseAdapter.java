package br.com.cod3r.adapter.hexagonal.infrastructure;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDatabaseAdapter implements UserRepository {
  private Map<String, User> memoryUsers = new HashMap<String, User>();

  @Override
  public void save(User user){
    System.out.println("Gravando " + user);
    memoryUsers.put(user.getEmail(), user);
  }

  @Override
  public List<User> getAll() {
    System.out.println("Listando " + memoryUsers.values());
    return new ArrayList<User>(memoryUsers.values());
  }
}
