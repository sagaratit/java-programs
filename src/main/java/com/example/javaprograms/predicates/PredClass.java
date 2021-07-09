package com.example.javaprograms.predicates;

import java.util.List;
import java.util.function.Predicate;

class IntVal implements Predicate<Integer> {
    @Override
    public boolean test(Integer o) {
        return o > 5;
    }
}

public class PredClass {
    public static void main(String[] args) {
        System.out.println(" ---  predicates using class --- ");
        List<Integer> list = List.of(1,5,8,3,9,2,6);
        IntVal obj =  new IntVal();
        list.stream().filter(obj).forEach(System.out::println);

        System.out.println(" ---  predicates using lambda function --- ");
        Predicate<Integer> p = n -> n > 5;

        list.stream().filter(p).forEach(System.out::println);

        System.out.println(" ---  predicates using string lambda function --- ");
        List<String> ls = new java.util.ArrayList<>(List.of("sagar", "yadav", "ashu", "abc"));
        Predicate<String> strLen =  str -> (str.length() == 3);

        //ls.stream().filter(strLen).forEach(System.out::println);
        ls.removeIf(strLen);
        System.out.println(ls);
    }
}
