package com.example.javaprograms.observerintf;

public class Mainclass {
    public static void main(String[] args) {
        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());
    }
}
