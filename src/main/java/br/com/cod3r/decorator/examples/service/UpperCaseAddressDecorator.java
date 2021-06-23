package br.com.cod3r.decorator.examples.service;

import br.com.cod3r.decorator.examples.model.Address;

public class UpperCaseAddressDecorator extends AddressDecorator {

  public UpperCaseAddressDecorator(IAddressFormatter addressFormatter) {
    super(addressFormatter);
  }

  @Override
  public String prepareAddress(Address address) {
    return addressFormatter.prepareAddress(address).toUpperCase();
  }
}
