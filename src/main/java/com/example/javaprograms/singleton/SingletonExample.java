package com.example.javaprograms.singleton;


public class SingletonExample {
    private static SingletonExample singletonExample;
    private SingletonExample(){

    }
    public static SingletonExample getSingletonInstance( ) {
        if(singletonExample == null) {
            singletonExample=  new SingletonExample();
        }
        return singletonExample;
    }

    public static void main(String[] args) {
        SingletonExample s =SingletonExample.getSingletonInstance();
        System.out.println(s);
        System.out.println(new SingletonExample());
    }
}

