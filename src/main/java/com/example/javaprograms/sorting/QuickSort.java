package com.example.javaprograms.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 4, 6};
        System.out.println("-- before sort arr --");
        for(int i=0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }
        quickSortM(arr);
        System.out.println();
        System.out.println("-- after quicksort array-- ");
        for(int i=0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void quickSortM(int[] arr){
     quickSort(arr, 0,arr.length-1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        int pivot = arr[(left + right)/2];
        int index = partition(arr, left,right,pivot);
        quickSort(arr, left, index-1);
        quickSort(arr, index, right);
    }

    public static int partition(int[] arr, int left, int right, int pivot){
        while (left <= right){
                while (arr[left]< pivot){
                    left++;
                }
                while (arr[right] > pivot) {
                    right--;
                }
            if(left <= right) {
                int temp = arr[left];
                arr[left] =  arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
