package com.example.javaprograms.threds;

class FirstT extends Thread {
    public void run(){
        System.out.println("First T");
        for (int i=1; i <=5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First T i val= "+i);
        }
    }
}

class SecondT implements Runnable {

    @Override
    public void run() {
        System.out.println("Second T");
        for (int i=1; i <=5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second T i val= "+i);
        }
    }
}

public class TestJoinThread {
    public static void main(String[] args) throws InterruptedException {
        FirstT firstT =  new FirstT();
        firstT.start();
        SecondT secondT = new SecondT();
        Thread thread = new Thread(secondT);
        firstT.join();
        thread.start();
    }
}
