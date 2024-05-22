package com.jai.assignment_2;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int num = in.nextInt();
        int sum = 0;
        int fib0 = 0;
        int fib1 = 1;
        System.out.println("THe Fibonacci Numbers are");
        System.out.println(fib0);
        System.out.println(fib1);
        for (int i = 1; i <= num; i++) {
            sum = fib0 + fib1;
            fib0 = fib1;
            fib1 = sum;
            System.out.println(sum);
        }
    }
}
