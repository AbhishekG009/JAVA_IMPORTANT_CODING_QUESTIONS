package org.example.NORMAL_CODING;

public class FIBONACCI_BY_RECURSION {
    public static  int fibonacci(int n)
    {
        if(n<=1)
            return n;
        return fibonacci(n-1)+ fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
