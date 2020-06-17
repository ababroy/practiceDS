package com.java.ds.array;

import java.util.Arrays;

public class FibonacciSeries
{
    public static void main ( String[] args )
    {
        int n = 6;
        int[] arr = new int[ n +1];

        int sum = 0;
        int f = 0;
        arr[ 0 ] = f;
        int s = 1; 
        arr[ 1 ] = s;

        for ( int i = 2; i <= n; i++ )
        {
            sum = f + s ;
            arr[ i ] = sum;
            f = s;
            s = sum;

        }

        System.out.println( Arrays.toString( arr ) );
    }
}
