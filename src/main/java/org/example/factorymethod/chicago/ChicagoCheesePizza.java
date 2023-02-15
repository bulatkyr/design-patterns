package org.example.factorymethod.chicago;

import org.example.factorymethod.common.Pizza;

public class ChicagoCheesePizza extends Pizza {
  public ChicagoCheesePizza() {
    this.name = "Chicago cheese pizza";
    this.dough = "Chicago dough";
    this.sauce = "Chicago sour cream sauce";

    this.toppings.add("Shredded Mozzarella Cheese");
  }
}
