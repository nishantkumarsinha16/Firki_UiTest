package com.practise;

public class FindEvenAndOdd {

    public static void main(String[] args) {

        // evenOdd();
        noEvenOdd();

    }

    public static void evenOdd() {

        int a = 90;

        // If divided by two is EVEN otherwise ODD

        if (a % 2 == 0) {
            System.out.println("even = " + a);
        } else {
            System.out.println("odd = " + a);
        }

    }

    public static void noEvenOdd() {
        int a = 100;

        for (int i = 0; i <= a; i++) {

            if (i % 2 == 0) {
                System.out.println("even = " + i);
            } else if (i % 2 != 0) {

                System.out.println("odd= " + i);
            }

        }

    }

}
