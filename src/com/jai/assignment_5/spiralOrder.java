package com.jai.assignment_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//1. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
public class spiralOrder {
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> spiralOrder = spiralOrder(matrix);
        System.out.println(spiralOrder);
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length -1 ;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> spiralOrder = new ArrayList<>();
        while(top <= bottom && left <= right)
        {
            for(int i = left; i<= right; i++)
            {
                spiralOrder.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<= bottom; i++)
            {
                spiralOrder.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralOrder.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right)
            {
                for(int i = bottom; i >= top; i-- )
                {
                    spiralOrder.add(matrix[i][left]);
                }
                left++;
            }

        }
        return spiralOrder;
    }
}
