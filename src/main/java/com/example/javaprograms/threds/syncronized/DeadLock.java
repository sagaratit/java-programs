package com.example.javaprograms.threds.syncronized;

public class DeadLock {
    public static void main(String args[]) {

        final String resource1 = "resource 1";
        final String resource2 = "resource 2";

        Thread t1 = new Thread(){
          public void run(){
              synchronized (resource1) {
                  System.out.println("Thread1 locked resource1 "+resource1);
                  for (int i=1; i <=5; i++){
                      try {
                          Thread.sleep(1000);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                      System.out.println("First T i val= "+i);
                  }
                  synchronized (resource2) {
                      System.out.println("Thread1 locked resource1 "+resource2);
                  }
              }
          }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (resource2) {
                    System.out.println("Thread2 locked resource2 "+resource2);
                    for (int i=1; i <=5; i++){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Second T i val= "+i);
                    }
                    synchronized (resource1) {
                        System.out.println("Thread2 locked resource2 "+resource1);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
