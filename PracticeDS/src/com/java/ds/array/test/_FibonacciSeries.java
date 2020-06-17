package com.java.ds.array.test;

import java.util.Arrays;

public class _FibonacciSeries
{
    // 0,1,1,2,3,5,8,13,21
    // f = 0
    // s = 1
    // sum = f+s;
    public static void main ( String[] args )
    {
        int n = 8;
        
        int[] arr = new int[n+1];
        
        int f = 0;
        arr[0] = f;
        int s = 1;
        arr[1] = s;
        int sum =0;
        for(int i=2; i< arr.length; i++)
        {
            sum = f+s;
            arr[i] = sum;
            f = s;
            s = sum;
        }
        
        System.out.println( Arrays.toString(arr) );
    }
}
