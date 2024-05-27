package com.jai.assignment_7;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,3,8,9, -1, 10, 0};
        System.out.println("Before Sorting:"+ Arrays.toString(arr));
        selectSort(arr);
        System.out.println("After Sorting:"+Arrays.toString(arr));
    }

    static void selectSort(int[] arr) {

        for(int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length -1 - i; j++) {
                {
                int last = arr.length - 1 - i;
                int maxIndex = findMaxIndex(arr,last);
                swap_arr(arr,maxIndex,last);
                }

            }
        {
        }
    }

    static int findMaxIndex(int[] arr, int last) {
        int maxIndex = 0;
        for (int i = 1; i <= last ; i++) {
            if(arr[i] > arr[maxIndex])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap_arr(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
