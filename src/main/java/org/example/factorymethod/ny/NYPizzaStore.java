package org.example.factorymethod.ny;

import org.example.factorymethod.common.Pizza;
import org.example.factorymethod.common.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYCheesePizza();
            case "clam" -> new NYClamPizza();
            default -> throw new IllegalArgumentException("Pizza type is not supported");
        };
    }
}
