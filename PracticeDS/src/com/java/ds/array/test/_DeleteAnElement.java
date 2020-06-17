package com.java.ds.array.test;

import java.util.Arrays;

public class _DeleteAnElement
{
    public static void main ( String[] args )
    {
        int[] arr = {10,40,30,80,60,20};
        System.out.println( Arrays.toString( arr ) );
        int tbd = 30;
        
        for( int i=0; i<arr.length; i++)
        {
            if(arr[i]==tbd)
            {
                for(int d = i; d<arr.length-1; d++)
                {
                    arr[d] = arr[d+1];
                }
                arr[arr.length-1] = 0;
                break;
            }
        }
        
        for(int i =0; i< arr.length-1; i++)
        {
            System.out.print( arr[i] +" ");
        }
    }
}
