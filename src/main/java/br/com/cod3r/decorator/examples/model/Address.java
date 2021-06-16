package br.com.cod3r.decorator.examples.model;

public class Address {
  public final String street;
  public final String district;
  public final String city;
  public final String st;
  public final String zipcode;

  public Address(String street, String district, String city, String st, String zipcode){
    this.street = street;
    this.district = district;
    this.city = city;
    this.st = st;
    this.zipcode = zipcode;
  }



}
