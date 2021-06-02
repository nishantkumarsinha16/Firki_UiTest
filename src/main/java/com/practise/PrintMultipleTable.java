package com.practise;

public class PrintMultipleTable {

    public static void main(String[] args) {
        int table = 2;

        for (int i = 1; i <= 10; i++) {

            int output = i * table;
            System.out.println(table + "*" + i + "=" + output);

        }
    }

}
