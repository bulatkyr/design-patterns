package org.example.adapter.duck;

public class Test {
    public static void main(String[] args) {
        // I have a Duck interface and I know how to work with it because it is my class
        // I have Turkey interface and this is Vendor class, I cannot change it and I
        // don't want to change my code to work with it

        // I create instance of Vendor class which I need to use
        Turkey turkey = new SimpleTurkey();

        // I create adapter, so that I can use it as a Duck, but in reality it
        // translates all my requests to Vendor class
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        // I call quack as I used to, but it executes gobble
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
