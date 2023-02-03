package org.example.decorator.condiments;

import org.example.decorator.Beverage;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    super(beverage);
  }

  @Override
  public Double cost() {
    return 0.2 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}
