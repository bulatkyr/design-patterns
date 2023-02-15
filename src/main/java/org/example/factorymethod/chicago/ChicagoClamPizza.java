package org.example.factorymethod.chicago;

import org.example.factorymethod.common.Pizza;

public class ChicagoClamPizza extends Pizza {

  public ChicagoClamPizza() {
    this.name = "Chicago cheese pizza";
    this.dough = "Chicago dough";
    this.sauce = "Chicago sour cream sauce";

    this.toppings.add("clams");
  }
}
