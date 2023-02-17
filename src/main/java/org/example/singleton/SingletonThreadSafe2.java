package org.example.singleton;

public class SingletonThreadSafe2 {

    private static SingletonThreadSafe2 uniqueInstance = new SingletonThreadSafe2();

    private SingletonThreadSafe2() {
    }

    public static SingletonThreadSafe2 getInstance() {
        return uniqueInstance;
    }

}