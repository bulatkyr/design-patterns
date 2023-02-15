package org.example.factorymethod;

import org.example.factorymethod.chicago.ChicagoPizzaStore;
import org.example.factorymethod.common.PizzaStore;
import org.example.factorymethod.ny.NYPizzaStore;

public class BestPizza {

  public static void main(String[] args) {
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    chicagoPizzaStore.orderPizza("cheese");

    PizzaStore nyPizzaStore = new NYPizzaStore();
    nyPizzaStore.orderPizza("clam");
  }
}
