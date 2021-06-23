package br.com.cod3r.decorator.examples.service;

import br.com.cod3r.decorator.examples.model.Address;

public class BorderAddressFormatter implements IAddressFormatter {
  IAddressFormatter addressFormatter;

  public BorderAddressFormatter(IAddressFormatter addressFormatter){
    super();
    this.addressFormatter = addressFormatter;
  }

  @Override
  public String prepareAddress(Address address) {
    System.out.println("Border");
    String preparedAddress = addressFormatter.prepareAddress(address);
    StringBuilder sb = new StringBuilder();
    sb.append("----------------------------------\n");
    sb.append(preparedAddress);
    sb.append("\n");
    sb.append("----------------------------------");
    return sb.toString();
  }
}
