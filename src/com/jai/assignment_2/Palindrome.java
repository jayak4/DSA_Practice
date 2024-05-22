package com.jai.assignment_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a String to find out its Palindrome or not:");
        String input = in.next().trim();
        char[] inputChar = input.toCharArray();
        int start = 0;
        int end = inputChar.length - 1;
        while(true) {
            if (start < end)
            {
                if (inputChar[start] == inputChar[end]) {
                    start++;
                    end--;
                }
                else
                {
                    System.out.println(input+" is not Palindrome");
                    break;
                }
            }
            else
            {
                System.out.println(input+" is a Palindrome");
                break;
            }
        }
    }
}
