package org.example.adapter.duck;

public class TurkeyAdapter implements Duck {

    private Turkey turkeyToAdapt;

    public TurkeyAdapter(Turkey turkey) {
        this.turkeyToAdapt = turkey;
    }

    @Override
    public void quack() {
        // Leave gobble method as it is, because it is almost the same as quack
        turkeyToAdapt.gobble();
    }

    @Override
    public void fly() {
        // Turkey flight a little, so we need to fly 5 times to simulate the duck flying
        for (int i = 0; i < 5; i++) {
            turkeyToAdapt.fly();
        }
    }

}
