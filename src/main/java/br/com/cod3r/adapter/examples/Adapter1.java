package br.com.cod3r.adapter.examples;

import java.math.BigDecimal;

public class Adapter1 {
  //Client - Adapter1
  //Adapter (wrapper) - MyPayment (uses composition)
  //Adaptee - ThirdPartyPayment
  //Target - IPaymentProcess

  public static void main(String[] args) {
    MyPayment payment = new MyPayment();
    payment.debit(new BigDecimal("1500"));

    payment.credit(new BigDecimal("5.37"));

  }
}
