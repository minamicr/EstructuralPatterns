package br.com.cod3r.adapter.examples;

import java.math.BigDecimal;

public class MyPayment implements IPaymentProcess{
  private ThirdPartyPayment thirdPartyPayment = new ThirdPartyPayment();

  public void debit(BigDecimal value){
    thirdPartyPayment.authorize(value);
    thirdPartyPayment.capture(value);
  }

  public void credit(BigDecimal value){
    thirdPartyPayment.credit(value);
  }

}
