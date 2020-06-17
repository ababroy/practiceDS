package com.java.basics;

public class PalindromeNumber
{
    public static void main ( String[] args )
    {
        int num = 12321;
        int input = num;
        System.out.println( "num: "+num );
        int rev = 0;
        while(num > 0)
        {
            rev = rev*10 + (num % 10);
            num = num /10;
        }
        
        System.out.println( "reverse: "+(rev==input) );
        
        
    }
}
