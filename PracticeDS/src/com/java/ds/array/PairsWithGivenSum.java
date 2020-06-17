package com.java.ds.array;

import java.util.Arrays;

public class PairsWithGivenSum
{
    public static void main ( String[] args )
    {
        int[] arr = { 5, 8, 3, 4, 2, 6, 10, 7, 1, 9 };
        int givenSum = 11;

        /*
         * sort the array
         */
        Arrays.sort( arr );
        System.out.println( Arrays.toString( arr ) );

        int start = 0;
        int end = arr.length - 1;
        while ( start < end )
        {
            if ( arr[ start ] + arr[ end ] > givenSum )
            {
                end--;
            }
            else if ( arr[ start ] + arr[ end ] < givenSum )
            {
                start++;
            }
            else
            {
                System.out.println( "pair1:= " + arr[start] + ", pair2:= " + arr[end] );
                start++; // or end--;
            }
        }
    }
}
