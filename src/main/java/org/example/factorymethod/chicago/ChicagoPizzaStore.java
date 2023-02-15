package org.example.factorymethod.chicago;

import org.example.factorymethod.common.Pizza;
import org.example.factorymethod.common.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoCheesePizza();
            case "clam" -> new ChicagoClamPizza();
            default -> throw new IllegalArgumentException("Pizza type is not supported");
        };
    }
}
