package com.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateFromString {
    public static void main(String[] args) {
        duplicateWords("Nishant nishant Nishant Golu golu");
    }

    private static void duplicateWords(String inputString) {
        String str = inputString.toLowerCase();
        final String[] words = str.split(" ");
        final Map<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        final Set<String> wordsInString = wordCount.keySet();
        for (String word : wordsInString) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + " : " + wordCount.get(word));
            }
        }
    }

}
