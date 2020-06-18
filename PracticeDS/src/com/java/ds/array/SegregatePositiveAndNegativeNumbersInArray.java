package com.java.ds.array;

import java.util.Arrays;

public class SegregatePositiveAndNegativeNumbersInArray
{

    /**
     * Do normal sort it will do the expected job
     */
    public static void main ( String[] args )
    {
        int arr[] = { -1, 3, 8, -4, 5, -6, 7, -20, 30, 40 };
        System.out.println( Arrays.toString( arr ) );
        // 'i' starts from 0 and 'j' starts from arr.length-1

        for ( int a = 0; a < arr.length; a++ )
        {
            for ( int b = a + 1; b < arr.length; b++ )
            {
                if ( arr[ a ] > arr[ b ] )
                {
                    int t = arr[ a ];
                    arr[ a ] = arr[ b ];
                    arr[ b ] = t;
                }
            }
        }

        System.out.println( Arrays.toString( arr ) );
    }
}
