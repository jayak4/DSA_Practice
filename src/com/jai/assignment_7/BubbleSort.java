package com.jai.assignment_7;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,2,1,10};
        System.out.println("Before Sorting:"+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting:"+Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
