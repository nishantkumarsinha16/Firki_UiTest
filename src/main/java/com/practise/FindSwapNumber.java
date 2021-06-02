package com.practise;

public class FindSwapNumber {

    public static void main(String[] args) {

        swapNumMethod1();
        System.out.println("|--------------------NISHANT SINHA------------------------|");
        swapNumMethod2();

    }

    public static void swapNumMethod1() {
        /* Method - 1 */
        int a = 100;
        int b = 500;
        int c = a;
        a = b;
        b = c;

        System.out.println("a-- " + a);
        System.out.println("b-- " + b);

    }

    public static void swapNumMethod2() {

        /* Method - 2 */

        int a = 30;
        int b = 20;

        a = a + b; // a=20+30=50
        b = a - b; // b= 50-20=30
        a = a - b; // a= 50-30=20

        System.out.println("a-- " + a);
        System.out.println("b-- " + b);

    }

}
