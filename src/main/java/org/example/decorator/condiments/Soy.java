package org.example.decorator.condiments;

import org.example.decorator.Beverage;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    super(beverage);
  }

  @Override
  public Double cost() {
    return 0.25 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy milk";
  }
}
