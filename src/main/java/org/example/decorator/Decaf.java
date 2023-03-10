package org.example.decorator;

public class Decaf extends Beverage {

  public Decaf() {
    description = "Decaf";
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Double cost() {
    return 1.19;
  }
}
