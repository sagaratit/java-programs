package com.example.javaprograms.threds.syncronized;

class Table {
    public  void writeTable(int num) throws InterruptedException {
        for (int i =1; i<num; i++) {
            System.out.println(num * i);
            Thread.sleep(500);
        }
    }
}
class CallSync extends Thread{
    Table t;
    CallSync(Table t) {
        this.t = t;
    }
    public void run(){
        try {
            t.writeTable(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

 class CallSync1 extends Thread{
    Table t;
    CallSync1(Table t) {
        this.t = t;
    }
    public void run(){
        try {
            t.writeTable(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     public static void main(String[] args) {
         Table t =new Table();
         CallSync callSync = new CallSync(t);
         CallSync1 callSync1 = new CallSync1(t);
         callSync.start();
         callSync1.start();
     }
}
