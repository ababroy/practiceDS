package com.java.ds.array.test;

import java.util.Arrays;

/**
 * 1. Make two parts of the array as (n-r) and r
 * 
 * 2. Reverse part1 and part2 = Part1reverse Part2reverse
 * 
 * 3. Reverse whole Part1reverse.Part2reverse
 * 
 * @author AROY
 *
 */
public class _RotationOfAnArray
{
    static int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // {[5,4,3,2,1],[7,6]} // {6,7,1,2,3,4,5}

    static int rotate = 2;

    public static void main ( String[] args )
    {
        System.out.println( "Original: "+Arrays.toString(arr) );
        int n = arr.length - 1;
        int r = rotate;
        int mid = n-r;
        // part1
        reverseArray(arr, 0, mid);
        System.out.println( "Part-1: "+Arrays.toString(arr) );
        //part2
        reverseArray(arr, mid+1, n);
        System.out.println( "Part-2: "+Arrays.toString(arr) );
        
        // Whole reverse
        reverseArray( arr, 0, n );
        System.out.println( "Result: "+Arrays.toString(arr) );
    }

    private static void reverseArray ( int[] arr, int s, int e )
    {
        //for(int i= s; i<= e; i++ )
        while(s<=e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e --;
        }
    }

}
