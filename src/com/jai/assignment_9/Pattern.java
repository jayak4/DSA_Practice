package com.jai.assignment_9;

public class Pattern {
    public static void main(String[] args) {
        parrten31(5);
    }

    static void parrten5(int n) {
        int rowLen = 2 * n -1;
        int collen = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void parrten31(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n/2)-i+2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void parrten2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void parrten1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
