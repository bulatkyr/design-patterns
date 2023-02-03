package org.example.decorator.condiments;

import org.example.decorator.Beverage;

/** Parent class for all condiment decorators that can be "attached" to Beverage. */
public abstract class CondimentDecorator extends Beverage {

  protected final Beverage beverage;

  protected CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  public abstract String getDescription();
}
