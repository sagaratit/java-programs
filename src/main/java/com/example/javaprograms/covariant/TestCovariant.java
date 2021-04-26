package com.example.javaprograms.covariant;

class A {
    public A getClassObject() {
        return this;
    }

    public void getMessage() {
        System.out.println("A class");
    }

    public void message(){
        System.out.println("A message");
    }
}

class B extends A {
    public void getMessage() {
        System.out.println(" B Class");
    }

    public void message(){
        System.out.println("B message");
    }
    public B getClassObject() {
        return this;

    }
}

public class TestCovariant {
    public static void main(String[] args) {
        new B().getClassObject().getMessage();
        new A().getClassObject().getMessage();
        A b = new B();
        b.message();

    }

}
