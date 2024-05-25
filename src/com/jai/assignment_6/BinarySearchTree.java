package com.jai.assignment_6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {11,23,24,55,80,91,101};
        System.out.println("Array:"+ Arrays.toString(arr));
        System.out.println("Please Enter the target to find:");
        int target = in.nextInt();
        int targetPosition = bst(arr,target);
        System.out.println("Target array index:"+targetPosition);
    }

    public static int bst(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target > arr[mid])
            {
                start = mid+1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
