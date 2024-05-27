package com.jai.assignment_7;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,1,3,10,4};
        System.out.println("Before Sorting:"+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting:"+ Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1])
                {
                    sawp(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void sawp(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
