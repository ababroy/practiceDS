package com.java.ds.array;

import java.util.Arrays;

public class DeleteAnElement
{
    public static void main ( String[] args )
    {
        int[] arr = {10,40,30,80,60,20};
        int tbd = 30;
        
        for(int i =0; i< arr.length; i++)
        {
            if(arr[i] == tbd)
            {
                for(int a = i; a<arr.length-1; a++)
                {
                    arr[a]= arr[a+1];
                }
                arr[arr.length-1] = 0;
                break;
            }
        }
        
        System.out.println( Arrays.toString(arr) );
    }
}
