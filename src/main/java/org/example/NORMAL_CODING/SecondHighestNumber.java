package org.example.NORMAL_CODING;

public class SecondHighestNumber {
    public static int secondHighest(int[] nums)
    {
        int highest = Integer.MIN_VALUE;
        int sec_highest = Integer.MIN_VALUE;

        for(int num : nums)
        {
            if(num>highest)
            {
                sec_highest = highest;
                highest = num;
            }
            else if(num<highest && num>sec_highest)
            {
                sec_highest = num;
            }
        }
        return sec_highest;
    }

    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7};
        System.out.println(secondHighest(arr));
    }
}
