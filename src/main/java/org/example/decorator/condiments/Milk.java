package org.example.decorator.condiments;

import org.example.decorator.Beverage;

public class Milk extends CondimentDecorator {

  public Milk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public Double cost() {
    return 0.1 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }
}
