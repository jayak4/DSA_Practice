package com.jai.assignment_2;

import java.util.Scanner;

public class SimpleCalculator {
    public static int getInput(Scanner in)
    {
        System.out.println("Please Enter a numbers:");
        int num = in.nextInt();
        return num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operator;
        while(true)
        {
            System.out.println("Please Enter the operators(+,-,/,*) to perform calculation:");
            System.out.println("Enter x to exit the calculator:");
            operator = in.next();
            float total = 0;
            int flag = 0;
            switch (operator)
            {
                case "+": {
                    total = getInput(in) + getInput(in);
                    break;
                }
                case "-": {
                    total = getInput(in) - getInput(in);
                    break;
                }
                case "*": {
                    total = getInput(in) * getInput(in);
                    break;
                }
                case "/": {
                    total = getInput(in) / getInput(in);
                    break;
                }
                case "x": {
                    flag = 2;
                    break;
                }
                default:
                {
                    System.out.println("Please enter the correct option.!");
                    flag = 1;
                }
            }
            if (flag == 0)
                System.out.println("The Calculated Value:"+total);
            else if (flag == 2) {
                break;
            }

        }
    }
}
