package com.example.javaprograms.sudoku;

import java.util.ArrayList;

/**
 * This program validates sudoku of 3*3
 **/
public class SimpleSudoku {
    public static void main(String[] args) {
        int a[] = new int[3];
        int b[] = {2, 3};
        int sdk[][] = {
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6}
        };

        int rows = sdk.length;
        int cols = sdk[0].length;
        System.out.println("row len => "+rows);
        System.out.println("col len => "+cols);
        System.out.println("col => "+sdk[0]);
        ArrayList ans = new ArrayList<Integer>();
        System.out.println(" -- Given Sudoku --");
        for (int i = 0; i < sdk.length; i++) {
            for (int j = 0; j < sdk.length; j++) {
                System.out.print(sdk[i][j]);
                if (j != 2) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
        System.out.println(" Start Validation ...");
        int colm = 0;
        int colm1 = 0;
        int colm2 = 0;
        int hor1 = 0;
        int hor2 = 0;

        for (int i = 0; i < sdk.length; i++) {
            int temp = 0;
            for (int j = 0; j < sdk.length; j++) {
                temp = temp + sdk[i][j];
                if (j == 0) colm = colm + sdk[i][j];
                if (j == 1) colm1 = colm1 + sdk[i][j];
                if (j == 2) colm2 = colm2 + sdk[i][j];

            }
            ans.add(temp);
            System.out.println();
            hor1 = hor1 + sdk[i][i];
            hor2 = hor2 + sdk[2 - i][2 - i];
        }
        ans.add(colm);
        ans.add(colm1);
        ans.add(colm2);
        ans.add(hor1);
        ans.add(hor2);

        int cnt = 0;
        for (Object i : ans) {
            if ((int) i == 15) {
                cnt++;
            }
        }
        if (cnt == 8) {
            System.out.println(" Below Sudoku is valid");
        } else {
            System.out.println(" Below Sudoku is not valid");
        }
        for (int[] ints : sdk) {
            for (int j = 0; j < sdk.length; j++) {
                System.out.print(ints[j]);
                if (j != 2) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
