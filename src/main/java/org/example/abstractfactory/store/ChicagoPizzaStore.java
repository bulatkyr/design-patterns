package org.example.abstractfactory.store;

import org.example.abstractfactory.pizza.CheesePizza;
import org.example.abstractfactory.pizza.ClamsPizza;
import org.example.abstractfactory.pizza.Pizza;
import org.example.abstractfactory.ingredientsfactory.ChicagoIngredientsFactory;
import org.example.abstractfactory.ingredientsfactory.IngredientsFactory;

public class ChicagoPizzaStore extends PizzaStore {
  private final IngredientsFactory ingredientsFactory;

  public ChicagoPizzaStore() {
    ingredientsFactory = new ChicagoIngredientsFactory();
  }

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza;
    switch (type) {
      case "cheese" -> {
        pizza = new CheesePizza(ingredientsFactory);
        pizza.setName("Chicago Cheese Pizza");
      }
      case "clam" -> {
        pizza = new ClamsPizza(ingredientsFactory);
        pizza.setName("Chicago Clam Pizza");
      }
      default -> throw new IllegalArgumentException("Pizza type is not supported");
    }
    return pizza;
  }
}
