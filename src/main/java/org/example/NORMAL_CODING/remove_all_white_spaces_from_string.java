package org.example.NORMAL_CODING;

public class remove_all_white_spaces_from_string {
    public static String removeAllWhiteSpaces(String input)
    {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)!= ' ')
            {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeAllWhiteSpaces("I am abhi"));
    }
}
