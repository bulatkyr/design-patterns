package org.example.decorator;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House Blend";
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Double cost() {
    return 0.89;
  }
}
