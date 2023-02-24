package org.example.singleton;

enum Singleton {
    UNIQUE_INSTANCE;
}

public class SingletonEnumClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
    }
}