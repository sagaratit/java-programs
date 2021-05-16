package com.example.javaprograms.sorting;

import java.util.Arrays;

public class BitonicArray {
    public static void main(String[] args) {
        int [] array = {5, 10, 15, 25, 20, 3, 2, 1};
        Arrays.sort(array);
        System.out.println(array);
        bitonicArray(array);

    }
    static void bitonicArray(int[] array) {
        int max = array[array.length-1];
        System.out.println("max elem -> "+max);
        int cnt = array.length/2-1;
        for(int i=0;i < array.length;i++)
        {
            System.out.print(array[i]+", ");
        }
        System.out.println();
        System.out.println("-- start code -- ");
        for(int i=array.length - 1 ; i >= 0; i--)
        {
            System.out.print(array[i]+", ");
        }

        System.out.println();
        int ncnt= cnt;

        for(int i=array.length - 1 ; i >= cnt; i--)
        {
            int tmp = array[ncnt];
            array[ncnt] = array[i];
            array[i]=tmp;
            ncnt++;
            System.out.println("n line");
        }


        System.out.println();
        System.out.println("-- Bitonic array -- ");
        for(int i=0;i < array.length;i++)
        {
            System.out.print(array[i]+", ");
        }

    }
}
