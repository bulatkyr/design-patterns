package org.example.factorymethod.ny;

import org.example.factorymethod.common.Pizza;

public class NYClamPizza extends Pizza {
  public NYClamPizza() {
    this.name = "NewYork clam pizza";
    this.dough = "NewYork dough";
    this.sauce = "NewYork tomato sauce";

    this.toppings.add("clams");
  }
}
