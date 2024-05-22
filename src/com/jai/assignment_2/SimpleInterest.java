package com.jai.assignment_2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter principal amount:");
        int amount = in.nextInt();
        System.out.println("Please Enter the time (in years):");
        int year = in.nextInt();
        System.out.println("Please Enter the Rate:");
        float rate = in.nextFloat();
        rate = rate / 100;
        float simpleInterest = amount*year*rate;
        System.out.println("The calculated Interest was: "+simpleInterest);

    }
}
