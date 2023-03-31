package org.example.adapter.duck;

public class SimpleTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

}
