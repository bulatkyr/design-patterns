package org.example.abstractfactory.store;

import org.example.abstractfactory.pizza.CheesePizza;
import org.example.abstractfactory.pizza.ClamsPizza;
import org.example.abstractfactory.pizza.Pizza;
import org.example.abstractfactory.ingredientsfactory.IngredientsFactory;
import org.example.abstractfactory.ingredientsfactory.NYIngredientsFactory;

public class NYPizzaStore extends PizzaStore {
  private final IngredientsFactory ingredientsFactory;

  public NYPizzaStore() {
    ingredientsFactory = new NYIngredientsFactory();
  }

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza;
    switch (type) {
      case "cheese" -> {
        pizza = new CheesePizza(ingredientsFactory);
        pizza.setName("New York Cheese Pizza");
      }
      case "clam" -> {
        pizza = new ClamsPizza(ingredientsFactory);
        pizza.setName("New York Clam Pizza");
      }
      default -> throw new IllegalArgumentException("Pizza type is not supported");
    }
    return pizza;
  }
}
