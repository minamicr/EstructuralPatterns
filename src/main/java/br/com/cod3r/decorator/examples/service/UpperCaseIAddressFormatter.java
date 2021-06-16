package br.com.cod3r.decorator.examples.service;

import br.com.cod3r.decorator.examples.model.Address;

public class UpperCaseIAddressFormatter implements IAddressFormatter {
  IAddressFormatter addressFormatter;

  public UpperCaseIAddressFormatter(IAddressFormatter addressFormatter){
    super();
    this.addressFormatter = addressFormatter;
  }

  @Override
  public String prepareAddress(Address address) {
    return addressFormatter.prepareAddress(address).toUpperCase();
  }
}
