package org.example.abstractfactory.ingredientsfactory;

import org.example.abstractfactory.ingredients.*;
import org.example.abstractfactory.ingredients.ny.FreshClams;
import org.example.abstractfactory.ingredients.ny.RegianoCheese;
import org.example.abstractfactory.ingredients.ny.ThinDough;
import org.example.abstractfactory.ingredients.ny.TomatoSauce;

public class NYIngredientsFactory implements IngredientsFactory {

  @Override
  public Dough createDough() {
    return new ThinDough();
  }

  @Override
  public Sauce createSauce() {
    return new TomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new RegianoCheese();
  }

  @Override
  public Clams createClams() {
    return new FreshClams();
  }
}
