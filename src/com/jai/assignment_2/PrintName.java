package com.jai.assignment_2;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a Name:");
        String name = in.next();
        System.out.println("Hello "+name+"\nWelcome to Java Programming.!");
    }
}
