package org.example.abstractfactory.ingredientsfactory;

import org.example.abstractfactory.ingredients.Cheese;
import org.example.abstractfactory.ingredients.Clams;
import org.example.abstractfactory.ingredients.Dough;
import org.example.abstractfactory.ingredients.Sauce;

public interface IngredientsFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  Clams createClams();
}
