package br.com.cod3r.decorator.examples.service;

public abstract class AddressDecorator implements IAddressFormatter {
  IAddressFormatter addressFormatter;

  public AddressDecorator(IAddressFormatter addressFormatter){
    super();
    this.addressFormatter = addressFormatter;
  }

}
