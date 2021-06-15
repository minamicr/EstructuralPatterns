package br.com.cod3r.adapter.examples;

import java.math.BigDecimal;

public interface IPaymentProcess {

  void credit(BigDecimal value);
  void debit(BigDecimal value);

}
