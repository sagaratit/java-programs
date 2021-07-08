package com.example.javaprograms.sorting;

import java.util.Scanner;

public class ArrayGame {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int size=0;
        for(int i=0; i< game.length; i++){

            if(0 == game[i]){
                size++;
            }
        }
        if(size == game.length){
            return false;
        }
        else
            return true;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
