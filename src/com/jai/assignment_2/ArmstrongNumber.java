package com.jai.assignment_2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int num = in.nextInt();
        int sum = 0, rem = 0, originalNum = num;
        while (num > 0)
        {
            rem = num % 10;
            num = num / 10;
            sum = sum + (rem * rem * rem);
        }
        if (sum == originalNum)
            System.out.println(originalNum+" is a Armstrong Number");
        else
            System.out.println(originalNum+" is not a Armstrong Number");
    }
}
