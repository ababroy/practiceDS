package com.java.ds.array;

import java.util.Arrays;

public class RearrangeAnArraySuchThatArr_iBecomesiIfArr_iIsj
{
    public static void main ( String[] args )
    {
        int[] arr = {1,4,0,3,2}; // 
        //           0,1,2,3,4   // 2, 0, 4, 3, 1
        
        int temp[] = new int[arr.length];
        
        for( int i=0; i< arr.length; i++)
        {
            temp[arr[i]] = i;
        }
        System.out.println( Arrays.toString(temp) );
        for( int i=0; i< arr.length; i++)
        {
            arr[i] = temp[i];
        }
        
        System.out.println( Arrays.toString(arr) );
    }
}
