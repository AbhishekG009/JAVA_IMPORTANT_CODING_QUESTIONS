package org.example.NORMAL_CODING;

public class SWAP_TWO_NUMBERS {
    public static void swapp(int a , int b)
    {
         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println(a+", "+b );
    }

    public static void main(String[] args) {
        int a = 20;
        int b =30;
        swapp(20,30);
    }
}
