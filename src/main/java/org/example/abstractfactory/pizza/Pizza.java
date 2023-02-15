package org.example.abstractfactory.pizza;

import org.example.abstractfactory.ingredients.Cheese;
import org.example.abstractfactory.ingredients.Clams;
import org.example.abstractfactory.ingredients.Dough;
import org.example.abstractfactory.ingredients.Sauce;

public abstract class Pizza {
  protected String name;
  protected Dough dough;
  protected Sauce sauce;
  protected Cheese cheese;
  protected Clams clams;

  abstract public void prepare();

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public void setName(String name) {
    this.name = name;
  }
}
