package com.practise;

public class LexicographicalOrder {

    public static void main(String[] args) {

        String[] word = { "ABCDEF", "AA", "BEF", "A", "AABB" };
        String temp = "";

        for (int i = 0; i < word.length; i++) {

            for (int j = i + 1; j < word.length; j++) {
                // System.out.println(word[j]);

                if (word[i].compareToIgnoreCase(word[j]) > 0) {
                    temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;

                }

            }

        }
        for (String s : word) {
            System.out.println(s);

        }
        // for (int i = 0; i < word.length; i++) {
        // System.out.println(word[i]);
        // }

    }

}
