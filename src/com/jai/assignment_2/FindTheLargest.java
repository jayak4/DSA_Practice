package com.jai.assignment_2;

import java.util.Scanner;

public class FindTheLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1 > num2)
        {
            System.out.println(num1+" is greater than "+num2);
        } else if (num1 < num2) {
            System.out.println(num2+" is greater than "+num1);
        } else {
            System.out.println(num1+" is equal to "+num2);
        }
    }
}
