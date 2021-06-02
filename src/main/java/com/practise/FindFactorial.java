package com.practise;

import java.util.Scanner;

public class FindFactorial {
    static int facts = 1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num = s.nextInt();
        int fact = 1;

        // for (int i = 1; i <= num; i++) //Method 1
        for (int i = num; i >= 1; i--) // Method 2
        {
            fact = fact * i;
        }

        System.out.println(fact);

        // int num = 10;
        // factorialByrecursionMethod(num);
        // System.out.println("facts==========" + facts);

    }

    public static void factorialByrecursionMethod(int num) { // Method call her boday every time

        if (num >= 1) {

            facts = facts * num;
            factorialByrecursionMethod(num - 1);

        }

    }

}
