package com.example.javaprograms.strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 *Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.  **/
public class Anagrams {
    /*
    * a String first user input
    * b String second user input
    * return boolean
    * */
    static boolean isAnagram(String a, String b) {
        System.out.println("input first string => "+a);
        System.out.println("input first string => "+b);
        java.util.HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
        java.util.HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();
        if (a.length() >= 1 && b.length() <= 50) {
            for (int i = 0; i < a.length(); i++) {
                int cnt = 0;
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        cnt = cnt + 1;
                    }
                }
                m1.put(a.charAt(i), cnt);
            }
            for (int i = 0; i < b.length(); i++) {
                int cnt = 0;
                for (int j = 0; j < a.length(); j++) {
                    if (b.charAt(i) == a.charAt(j)) {
                        cnt = cnt + 1;
                    }
                }
                m2.put(b.charAt(i), cnt);
            }
            System.out.println(m1);
            System.out.println(m1);

            boolean total = false;
            for (Character c : m1.keySet()) {
                if (m1.get(c) == m2.get(c)) {

                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
