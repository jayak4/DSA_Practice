package com.jai.assignment_6;

import java.util.Arrays;

public class PrefectSquare {
    public static void main(String[] args) {
        int num = 25;
        System.out.println(isPerfectSquare(num));

    }
   public static boolean isPerfectSquare_1(int num) {
       int len = (num / 2) + 1;
       for (int i = 0; i <= len; i++) {
           if (i * i == num) {
               return true;
           }
       }
        return false;
    }
    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num - 1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            int midSquare = mid*mid;
            if(midSquare == num)
            {
                return true;
            } else if (midSquare < num) {
                start = mid + 1 ;
            } else if (midSquare > num) {
                end = mid - 1;

            }
        }
        return false;
    }
}
