package org.example.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe uniqueInstance;

    private SingletonThreadSafe() {
    }

    public synchronized static SingletonThreadSafe getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonThreadSafe();
        }
        return uniqueInstance;
    }

}