package com.jai.assignment_2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int num = in.nextInt();
        if (num % 2 == 0)
            System.out.println(num+" is a Even number.!");
        else
            System.out.println(num+" is a Odd number.!");
    }
}
