package br.com.cod3r.decorator.examples.service;

import br.com.cod3r.decorator.examples.model.Address;

public class UpperCaseAddress {

  SimpleAddress simpleAddress;

  public UpperCaseAddress(SimpleAddress simpleAddress){
    super();
    this.simpleAddress = simpleAddress;
  }

  public String prepareAddress(Address address){
    return simpleAddress.prepareAddress(address).toUpperCase();
  }
}
