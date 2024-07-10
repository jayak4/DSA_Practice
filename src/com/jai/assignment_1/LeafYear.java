package com.jai.assignment_1;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Please Input the year:");
        int year = in.nextInt();
        if (year % 4 == 0)
        {
            System.out.println(year+" is a leaf year.!");
        }
        else
        {
            System.out.println(year+" is not a leaf year.!");
        }
    }
}
