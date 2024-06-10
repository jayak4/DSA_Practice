package com.jai.assignment_6;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReverse {
    public static void main(String[] args) {
        int[] nums = {1,4,5,6,7,3};
        System.out.println("Before Reversing:"+ Arrays.toString(nums));
        int start = 0;
        int end = nums.length - 1;
        while (start<=end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println("After reversing:"+Arrays.toString(nums));

    }
}
