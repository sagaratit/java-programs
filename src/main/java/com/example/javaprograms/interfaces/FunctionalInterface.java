package com.example.javaprograms.interfaces;

public class FunctionalInterface {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("this is functional interface");
            }
        };
        runnable.run();
    }
}
