package org.example.NORMAL_CODING;

public class checkArmstrongNumber {
    public static boolean isArmstrong(int number)
    {
        int original = number;
        int sum =0;

        int digits = String.valueOf(number).length();
        while(number >0)
        {
            int digit = number %10;
            sum+=Math.pow(digit, digits);
            number = number/10;

        }
        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(2000));
    }

}
