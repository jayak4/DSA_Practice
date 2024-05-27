package com.jai.assignment_8;

public class Palindrome {
    public static void main(String[] args) {
        String str= "abcbaa";
        int len = str.length();
        boolean flag = true;
        for (int i = 0; i < (len/2)+1 ; i++) {
            if(str.charAt(i) != str.charAt((len-1)-i))
            {
                flag = false;
                break;
            }

        }
        if(flag)
        {
            System.out.println(str+" is a Palindrome");
        }
        else
        {
            System.out.println(str+" is not a Palindrome");
        }
    }
}
