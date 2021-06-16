package br.com.cod3r.decorator.examples;

import br.com.cod3r.decorator.examples.model.Address;
import br.com.cod3r.decorator.examples.service.SimpleAddress;
import br.com.cod3r.decorator.examples.service.UpperCaseAddress;

public class Decorator1 {

  public static void main(String[] args) {
    Address address = new Address("St.Louis st, 143", "Louisiana", "Maine", "MN", "94384");

    SimpleAddress simpleAddress = new SimpleAddress();
    System.out.println(simpleAddress.prepareAddress(address));

    UpperCaseAddress upperCaseAddress = new UpperCaseAddress(simpleAddress);
    System.out.println(upperCaseAddress.prepareAddress(address));


  }
}
