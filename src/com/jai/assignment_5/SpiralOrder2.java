package com.jai.assignment_5;

import java.util.Arrays;

//2. [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)
public class SpiralOrder2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr = new int[n][n];
        spiralOder(arr);
        System.out.println("SpiralOder of Array Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void spiralOder(int[][] arr) {
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        int count = 1;
        while(top <= bottom && left <= right)
        {
            for (int i = left; i <= right ; i++) {
                arr[top][i] = count;
                count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = count;
                count++;
            }
            right--;
            if(top <= bottom)
            {
                for (int i = right; i >= left ; i--) {
                    arr[bottom][i] = count;
                    count++;
                }
                bottom--;
            }
            if(left <= right)
            {
                for (int i = bottom; i >= top ; i--) {
                    arr[i][left] = count;
                    count++;
                }
                left++;
            }
        }
    }
}
