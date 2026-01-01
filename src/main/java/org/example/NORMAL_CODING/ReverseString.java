package org.example.NORMAL_CODING;

public class ReverseString {
    public static String reverseString(String input)
    {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = input.length()-1;
        while(left< right)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);

    }

    public static void main(String[] args) {
        String input = "ABHISHEK";
        System.out.println(reverseString(input));

    }

}
