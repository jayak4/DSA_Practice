package com.jai.assignment_6;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers= {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(numbers[start]+numbers[end] != target)
        {
            if(numbers[start]+numbers[end] < target)
            {
                start++;
            }
            else
            {
                end --;
            }
        }

        return new int[]{start+1,end+1};

    }
}
