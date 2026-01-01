package org.example.NORMAL_CODING;

public class Prime_number_in_most_efficient_way {
    public static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        if(num<=3)
        {
            return true;
        }
        if(num%2==0 || num %3 ==0)
        {
            return false;
        }
        for(int i=5;i*i<=num;i+=6)
        {
            if(num%i ==0 || num %(i+2) ==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(23));
    }
}

//It iterates through the potential factors up to the square root of the number ,
//checking divisibilty at 6K+1 intervals to efficiently determine if a number is prime.