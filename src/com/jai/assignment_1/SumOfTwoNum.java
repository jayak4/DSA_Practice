package com.jai.assignment_1;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Two Numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("The sum of two numbers = "+(num1+num2));
    }

}
