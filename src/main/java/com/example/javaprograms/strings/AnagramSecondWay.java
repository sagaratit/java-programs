package com.example.javaprograms.strings;

import java.util.Arrays;

public class AnagramSecondWay {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";

        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        boolean flag = validateAnagram(first, second);
        System.out.println((flag)? "Anagram Strings " : "Not anagram Strings");
    }

    static boolean validateAnagram(char[] first, char[] second) {
        if (first.length != second.length) {
            return false;
        }
        System.out.println(" --Array without sort-- ");
        System.out.println(first);
        System.out.println(second);
        System.out.println("Array with sorted");
        Arrays.sort(first);
        Arrays.sort(second);
        System.out.println(first);
        System.out.println(second);
        if (Arrays.equals(first, second))
            return true;
        else
            return false;
    }
}
