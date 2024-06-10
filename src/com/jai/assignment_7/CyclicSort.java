package com.jai.assignment_7;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println("Before CyclicSort:"+ Arrays.toString(arr));
        //MissingPositiveNum(arr);
        cyclicSort(arr);
        //cyclicSortMissingAllNum(arr);
        System.out.println("After sorting:"+Arrays.toString(arr));
        //printMissingNum(arr);
    }

    static void printMissingNum(int[] arr) {
        boolean flag = true;
        for (int i = 0; i <= arr.length; i++) {
            if(i < arr.length) {
                if (i + 1 != arr[i]) {
                    System.out.println("Missing numbers:" + (i + 1));
                    System.out.println("Repeated numbers:" + arr[i]);
                    System.out.println("Duplicate numbers:" + arr[i]);
                    flag = false;
                }
            }
        }
        if(flag)
        {
            System.out.println("Missing Number:"+(arr.length+1));
        }
    }

    private static void cyclicSort(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            int correct = i+1;
            while(arr[i] != correct)
            {
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }

        }

    }

    private static void cyclicSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] != i+1)
            {
               int temp = arr[arr[i] - 1];
               arr[arr[i] - 1] = arr[i];
               arr[i] = temp;
            }
        }
    }
    private static void cyclicSortMissingNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] != i)
            {
                if(arr[i] == arr.length) {
                    break;
                }
                else {
                    int temp = arr[arr[i]];
                    arr[arr[i]] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    private static void cyclicSortMissingAllNum(int[] arr) {
       int i = 0;
       while ( i < arr.length)
       {
           int correct = arr[i] - 1;
           if(arr[i] != arr[correct])
           {
               int temp = arr[i];
               arr[i] = arr[correct];
               arr[correct] = temp;
           }
           else
           {
               i++;
           }
       }
    }
    private static void MissingPositiveNum(int[] arr) {
        int i = 0;
        while ( i < arr.length)
        {
            if(arr[i] < 1) {
                break;
            }
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
            {
                i++;
            }
        }

    }

}
