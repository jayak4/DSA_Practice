package com.jai.assignment_1;

import java.util.Scanner;

public class PrintSumOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "0";
        int sum = 0;
        while(true)
        {
            sum = sum + Integer.parseInt(input);
            System.out.println("Please press x to print the result");
            System.out.println("Please enter a number to sum:");
            input = in.next();
            if  (input.contains("x") || input.contains("X"))
            {
                break;
            }
        }
        System.out.println("Sum of all numbers:"+sum);

    }
}
