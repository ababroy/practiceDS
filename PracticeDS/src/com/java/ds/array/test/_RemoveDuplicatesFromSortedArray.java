package com.java.ds.array.test;

import java.util.Arrays;

public class _RemoveDuplicatesFromSortedArray
{
    // static int arr[] = { 1, 2, 2, 3, 3, 3, 4, 4 };

    static int arr[] = { 1, 2, 2, 3, 3, 4, 4, 5, 5 };

    public static void main ( String[] args )
    {
         usingExtraSpace( arr );
        usingConstantSpace( arr );
    }

    private static void usingConstantSpace ( int arr[] )
    {
        int count = 0;
        int n = arr.length;
        int k = 0;
        for ( int i = 0; i < n - 1; i++ )
        {
            if ( arr[ i ] != arr[ i + 1 ] )
            {
                count++;
                arr[ k ] = arr[ i ];
                k++;
            }
        }
        arr[ k ] = arr[ arr.length - 1 ];

        System.out.println( Arrays.toString( arr ) );
        for ( int a = 0; a <= count; a++ )
        {
            System.out.print( arr[a]+ " " );
        }
    }

    private static void usingExtraSpace ( int arr[] )
    {

        int n = arr.length;
        int[] res = new int[ n ];
        int k = 0;
        int resCount = 0;

        for ( int i = 0; i < n - 1; i++ )
        {
            if ( arr[ i ] != arr[ i + 1 ] )
            {
                resCount++;
                res[ k ] = arr[ i ];
                k++;
            }
        }
        res[ k ] = arr[ arr.length - 1 ]; // last element
        
        System.out.println( Arrays.toString( res ) );
        for ( int i = 0; i <= resCount; i++ )
        {
            System.out.print( res[ i ] + " " );
        }
        System.out.println( "\n++++++++++++++++++" );
    }

}
