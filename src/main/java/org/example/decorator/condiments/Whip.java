package org.example.decorator.condiments;

import org.example.decorator.Beverage;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    super(beverage);
  }

  @Override
  public Double cost() {
    return 0.15 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
