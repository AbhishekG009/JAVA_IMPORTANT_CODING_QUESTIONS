package org.example.NORMAL_CODING;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_characters_in_a_string {
    public static void findDuplicate(String input)
    {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char c : input.toCharArray())
        {
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : charCount.entrySet())
        {
            if(entry.getValue() >1)
            {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times ");
            }

        }
    }

    public static void main(String[] args) {
        String input = "programming";
        findDuplicate(input);
    }
}
