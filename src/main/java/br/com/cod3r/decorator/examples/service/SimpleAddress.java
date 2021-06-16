package br.com.cod3r.decorator.examples.service;

import br.com.cod3r.decorator.examples.model.Address;

public class SimpleAddress {
  public String prepareAddress(Address address) {
    StringBuilder sb = new StringBuilder();
    sb.append("\n");
    sb.append(address.street);
    sb.append("\n");
    sb.append(address.district);
    sb.append("\n");
    sb.append(address.city);
    sb.append("\n");
    sb.append(address.st);
    sb.append("\n");
    sb.append(address.zipcode);
    return sb.toString();
  }

}
