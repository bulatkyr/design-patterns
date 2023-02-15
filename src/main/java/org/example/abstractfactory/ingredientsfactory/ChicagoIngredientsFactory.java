package org.example.abstractfactory.ingredientsfactory;

import org.example.abstractfactory.ingredients.*;
import org.example.abstractfactory.ingredients.chicago.CreamSauce;
import org.example.abstractfactory.ingredients.chicago.FrozenClams;
import org.example.abstractfactory.ingredients.chicago.MozzarellaCheese;
import org.example.abstractfactory.ingredients.chicago.ThickDough;

public class ChicagoIngredientsFactory implements IngredientsFactory {
  @Override
  public Dough createDough() {
    return new ThickDough();
  }

  @Override
  public Sauce createSauce() {
    return new CreamSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Clams createClams() {
    return new FrozenClams();
  }
}
