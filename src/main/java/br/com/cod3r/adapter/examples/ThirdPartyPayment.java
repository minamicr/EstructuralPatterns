package br.com.cod3r.adapter.examples;

import java.math.BigDecimal;

public class ThirdPartyPayment {

  // simulates a lib (.jar), you don´t have access

  public void authorize(BigDecimal value) {
    System.out.println("Authorizing payment " + value.toString());
  }

  public void capture(BigDecimal value) {
    System.out.println("Capturing payment " + value.toString());
  }

  public void credit(BigDecimal value) {
    System.out.println("Crediting payment " + value.toString());
  }
}
