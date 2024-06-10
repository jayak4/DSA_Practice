package com.jai.assignment_6;

public class SingleNonDuplicate {
    public static void main(String[] args) {
//        int[] nums = {1,1,2,3,3,4,4,8,8};
        int[] nums = {1};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);

    }
    public static int singleNonDuplicate(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    if(end == 0)
    {
        return nums[end];
    }
     while(start <= end)
    {
        if(nums[start] == nums[start+1])
        {
            start += 2;
        }
        else {
            return nums[start];
        }
        if(nums[end] == nums[end-1])
        {
            end -= 2;
        }
        else {
            return nums[end];
        }

    }
        return -1;
    }
}
