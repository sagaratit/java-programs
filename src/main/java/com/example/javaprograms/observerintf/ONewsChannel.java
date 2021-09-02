package com.example.javaprograms.observerintf;

import java.util.Observable;
import java.util.Observer;

public class ONewsChannel implements Observer {
    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setNews((String) news);
    }
}
