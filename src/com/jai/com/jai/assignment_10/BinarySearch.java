package com.jai.com.jai.assignment_10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8,9};
        int target = 7;
        int start = 0;
        int end = arr.length - 1;
        int index = binarySearch1(arr,target,start,end);
        System.out.println("Array Element:"+ Arrays.toString(arr));
        System.out.println("Target Value:"+target);
        System.out.println("Target Index:"+index);
    }

    static int binarySearch1(int[] arr, int target, int start, int end) {
        int mid = start + (end - start)/2 ;
        if(start > end) {
            return -1;
        }
        if(arr[mid] == target)
        {
            return mid;
        }
        if (arr[mid] > target) {
            end = mid - 1;
        } else if (arr[mid] < target) {
            start = mid + 1;
        }
        return binarySearch1(arr, target, start, end);

    }

}
