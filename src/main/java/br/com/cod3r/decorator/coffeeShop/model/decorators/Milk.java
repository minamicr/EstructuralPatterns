package br.com.cod3r.decorator.coffeeShop.model.decorators;

import br.com.cod3r.decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator{

  public Milk(Drink drink){
    super(drink);
  }

  @Override
  public void serve() {
    drink.serve();
    System.out.println("- Add 50ml of milk");
  }

  @Override
  public Double getPrice() {
    return drink.getPrice() + 0.5d;
  }
}
