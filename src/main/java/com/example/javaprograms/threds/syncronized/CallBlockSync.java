package com.example.javaprograms.threds.syncronized;

class Table1 {
    public  void writeTable(int num) throws InterruptedException {
     synchronized (this){
         for (int i =1; i<num; i++) {
             System.out.println(num * i);
             Thread.sleep(500);
         }
     }
    }
}

class CallBlockSync extends Thread{
    Table1 t;
    CallBlockSync(Table1 t) {
        this.t = t;
    }
    public void run(){
        try {
            t.writeTable(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void run(int i) {
        System.out.println("value of i="+i);
    }
}

class CallBlockSync1 extends Thread{
    Table1 t;
    CallBlockSync1(Table1 t) {
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
        Table1 t =new Table1();
        CallBlockSync callSync = new CallBlockSync(t);
        CallBlockSync1 callSync1 = new CallBlockSync1(t);
        callSync.start();
        callSync1.start();
    }
}

