package br.com.cod3r.decorator.examples.service;

import br.com.cod3r.decorator.examples.model.Address;

public interface IAddressFormatter {
  String prepareAddress(Address address);
}
