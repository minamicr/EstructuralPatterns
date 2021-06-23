package br.com.cod3r.decorator.examples.service;

import br.com.cod3r.decorator.examples.model.Address;

public class UpperCaseAddressFormatter implements IAddressFormatter {
  IAddressFormatter addressFormatter;

  public UpperCaseAddressFormatter(IAddressFormatter addressFormatter){
    super();
    this.addressFormatter = addressFormatter;
  }

  @Override
  public String prepareAddress(Address address) {
    System.out.println("Uppercase");
    return addressFormatter.prepareAddress(address).toUpperCase();
  }
}
