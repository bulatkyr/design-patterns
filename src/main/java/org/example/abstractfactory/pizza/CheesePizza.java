package org.example.abstractfactory.pizza;

import org.example.abstractfactory.ingredientsfactory.IngredientsFactory;

public class CheesePizza extends Pizza {
  private final IngredientsFactory ingredientsFactory;

  public CheesePizza(IngredientsFactory ingredientsFactory) {
    this.ingredientsFactory = ingredientsFactory;
    this.name = "Cheese pizza";
  }

  @Override
  public void prepare() {
    dough = ingredientsFactory.createDough();
    this.sauce = ingredientsFactory.createSauce();
    this.cheese = ingredientsFactory.createCheese();

    System.out.println("Preparing " + name);
    System.out.println("Tossing dough ...");
    System.out.println("Adding sauce ...");
  }
}
