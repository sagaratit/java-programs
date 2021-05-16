package com.example.javaprograms.strings;

import java.util.Scanner;

public class SubstringComparison {
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
