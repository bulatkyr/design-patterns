package org.example.abstractfactory;

import org.example.abstractfactory.store.ChicagoPizzaStore;
import org.example.abstractfactory.store.NYPizzaStore;

public class BestPizza {

  public static void main(String[] args) {
    NYPizzaStore nyPizzaStore = new NYPizzaStore();
    nyPizzaStore.orderPizza("cheese");

    ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    chicagoPizzaStore.orderPizza("clam");
  }
}
