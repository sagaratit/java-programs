package com.example.javaprograms.observer;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());
        System.out.println(new Date());
        System.out.println(new java.sql.Date(132888484));

    }
}
