package com.example.javaprograms.interfaces;

interface A {
    void getName();

    void getCity();
}

interface B extends A {
    void oldName();
}

abstract class C {
    abstract void listOfName();

    String getCountryName() {
        return "SG";
    }
}

class D extends C {

    @Override
    void listOfName() {
        System.out.println(" override method ");
    }
}

public class TestClass {
    public static void main(String[] args) {
        D d = new D();
        d.listOfName();
    }
}
