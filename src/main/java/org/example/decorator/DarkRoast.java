package org.example.decorator;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    this.description = "Dark roast";
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Double cost() {
    return 0.99;
  }
}
