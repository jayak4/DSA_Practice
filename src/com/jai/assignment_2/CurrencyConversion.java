package com.jai.assignment_2;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the INR amount:");
        float InrAmount = in.nextInt();
        float USD =  InrAmount / 71;
        System.out.println("Currency conversion rate -> 1 USD = 71 INR");
        System.out.println("INR amount:"+InrAmount);
        System.out.println("USD amount:"+USD);

    }
}
