package com.example.javaprograms.collections;

class A {
    public void methodA() {
        System.out.println("Test A");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("Test B");
    }
}

class C extends B {
    public void methodC() {
        System.out.println("Test B");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

    }
}
