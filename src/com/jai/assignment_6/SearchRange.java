package com.jai.assignment_6;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        //int[] nums = {5,7,7,8,8,10};
        int[] nums = {2,2};
        //int target = 8;
        int target = 2;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        int[] ans = {-1,-1};
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] == target)
            {
                for(int i = mid; i <= end; i++){
                    if(nums[i] == target)
                    {
                        ans[1] = i;
                    }
                    else
                    {
                        break;
                    }
                }
                for(int i = mid; i >= start; i--)
                {
                    if(nums[i] == target)
                    {
                        ans[0] = i;
                    }
                    else
                    {
                        break;
                    }
                }
                break;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else if(nums[mid] > target)
            {
                end = mid - 1;
            }

        }
        return ans;
    }
}
