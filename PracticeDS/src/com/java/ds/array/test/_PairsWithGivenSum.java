package com.java.ds.array.test;

import java.util.Arrays;

public class _PairsWithGivenSum
{
    public static void main ( String[] args )
    {
        int[] arr = { 5, 8, 3, 4, 2, 6, 10, 7, 1, 9 };
        Arrays.sort( arr );
        System.out.println( Arrays.toString( arr ) );
        int gs = 11; // given sum

        int s = 0;
        int e = arr.length - 1;

        while ( s < e )
        {
            if ( arr[ s ] + arr[ e ] == gs )
            {
                System.out.println( arr[ s ] + " + " + arr[ e ] );
                s++;  //e--;
            }
            else if ( arr[ s ] + arr[ e ] > gs )
            {
                e--;
            }
            else if ( arr[ s ] + arr[ e ] < gs )
            {
               s++;
            }
        }
    }
}
