package org.example.decorator;

public class Espresso extends Beverage {

  public Espresso() {
    description = "Espresso";
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Double cost() {
    return 1.99;
  }
}
