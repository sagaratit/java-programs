package com.example.javaprograms.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArrayWaveForm {
    public static void main(String[] args) {
        int arr[] = {3, 6, 5, 10, 7, 20,2,4};
        for (int elm:arr){
            System.out.print(elm+",");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int elm:arr){
            System.out.print(elm+",");
        }
        System.out.println();
        for (int i=0; i<= arr.length-2;i++){
            if(i%2 == 0){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for (int elm:arr){
            System.out.print(elm+",");
        }
    }
}
