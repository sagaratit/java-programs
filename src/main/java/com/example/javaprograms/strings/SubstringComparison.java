package com.example.javaprograms.strings;

import java.util.Scanner;
/**
 * Get the String and number from the user
 * String to find pattern and as given count
 * E.g String s = "welcometojava" and k=3
 * output = ava and wel
 * **/
public class SubstringComparison {
    /**
     * s @String user input
     * k @int user input
     * return @String smallest + largest
     **/
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - 1; i++) {
            if (i == 0) {
                largest = s.substring(i, k + i);
            }
            if (s.length() == (k + i)) {
                smallest = s.substring(i, k + i);
                break;
            }
            s.substring(i, k + i);
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
