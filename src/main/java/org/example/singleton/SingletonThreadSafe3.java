package org.example.singleton;

public class SingletonThreadSafe3 {

    private volatile static SingletonThreadSafe3 uniqueInstance;

    private SingletonThreadSafe3() {
    }

    public static SingletonThreadSafe3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonThreadSafe3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonThreadSafe3();

                }
            }
        }
        return uniqueInstance;
    }

}