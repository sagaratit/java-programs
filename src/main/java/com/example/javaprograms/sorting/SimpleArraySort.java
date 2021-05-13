package com.example.javaprograms.sorting;

/**
 * This is simple array sort not using any sorting methodology e.g quickSort ot bubble
 **/
public class SimpleArraySort {
    public static void main(String[] args) {
        int arr[] = {5,3,1,9,5,8};
        //int arr[] = {90,-20,8,11,3}; // to test negative element in array
        int len = arr.length;
        System.out.println("-- Original Array -- ");
        for (int i:arr){
            System.out.print(i+",");
        }

        for (int i=0 ; i< len ;i++){
            for (int j=i+1; j < len; j++){
                if(arr[i] < arr[j]){
                    int temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("-- Sorted Array -- ");
        for (int i:arr){
            System.out.print(i+",");
        }
    }
}
