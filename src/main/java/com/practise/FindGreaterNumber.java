package com.practise;

public class FindGreaterNumber {

    static int a = 90;
    static int b = 100;
    static int c = 50;

    public static void main(String[] args) {

        twoNumber();

        FindGreaterNumber c = new FindGreaterNumber();
        c.largestTwoNumber();

    }

    public static void twoNumber() {
        /* Method 1 */

        if (a > b && a > c) {
            System.out.println("a is greater " + a);
        } else if (b > a && b > c) {

            System.out.println("b is greater " + b);
        } else {
            System.out.println("c is greater " + c);

        }
    }

    public void largestTwoNumber() {

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }

}
