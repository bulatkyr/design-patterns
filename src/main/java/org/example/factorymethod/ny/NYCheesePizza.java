package org.example.factorymethod.ny;

import org.example.factorymethod.common.Pizza;

public class NYCheesePizza extends Pizza {
  public NYCheesePizza() {
    this.name = "NewYork cheese pizza";
    this.dough = "NewYork dough";
    this.sauce = "NewYork sour cream sauce";

    this.toppings.add("Grated Reggiano Cheese");
  }
}
