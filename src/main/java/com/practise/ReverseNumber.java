package com.practise;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 4321, remender, rev = 0;

        while (num != 0) {

            remender = num % 10;
            rev = rev * 10 + remender;
            num = num / 10;

        }
        System.out.println(rev);

    }

}
