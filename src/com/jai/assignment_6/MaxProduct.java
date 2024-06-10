package com.jai.assignment_6;
//Given an array of integers find the maximum product:
//Arr  = [1,2,3,4,5] -> ans = 20
public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        int maxProduct = 0;
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            start = 0;
            while (start < end) {
                int ans = arr[start] * arr[end];
                start++;
                if (maxProduct < ans) {
                    maxProduct = ans;
                }
            }
            end--;
        }
        System.out.println("Maximum Product:"+maxProduct);
    }
}
