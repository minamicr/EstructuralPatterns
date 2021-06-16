package br.com.cod3r.decorator.examples;

import br.com.cod3r.decorator.examples.model.Address;
import br.com.cod3r.decorator.examples.service.IAddressFormatter;
import br.com.cod3r.decorator.examples.service.SimpleIAddressFormatter;
import br.com.cod3r.decorator.examples.service.UpperCaseIAddressFormatter;

public class Decorator2 {

  public static void main(String[] args) {
    Address address = new Address("St.Louis st, 143", "Louisiana", "Maine", "MN", "94384");

    IAddressFormatter addressFormatter = new SimpleIAddressFormatter();
    System.out.println(addressFormatter.prepareAddress(address));

    addressFormatter = new UpperCaseIAddressFormatter(addressFormatter);
    System.out.println(addressFormatter.prepareAddress(address));
  }
}
