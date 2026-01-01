package org.example.NORMAL_CODING;

import java.util.HashMap;
import java.util.Map;

public class Count_number_of_words_in_a_string_using_hashmap {
    public static Map<String , Integer> countWords(String input)
    {
        Map<String,Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");   //"\\s+" is any white space character 1 or more times
        for(String word : words)
        {
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }
        return wordCount;

    }

    public static void main(String[] args) {
        System.out.println(countWords(" I LOVE MATCHSS"));
    }

}
