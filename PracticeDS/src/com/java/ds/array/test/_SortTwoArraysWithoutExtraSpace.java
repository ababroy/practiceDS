package com.java.ds.array.test;

import java.util.Arrays;

public class _SortTwoArraysWithoutExtraSpace
{
    public static void main ( String[] args )
    {
        int arr1[] = { 6, 4, 90, 23, 1, 67 };// { 1, 3, 5, 7, 9 }; // 1,2,3,4,5

        Arrays.sort( arr1 );

        int arr2[] = { 2, 4, 8, 10, 11, 12, 16 }; // 7,8,9,10,11,12,16
        Arrays.sort( arr2 );

        int a1 = 0;
        int l1 = arr1.length;

        int a2 = 0;
        int l2 = arr2.length;

        while ( a1 < l1 && a2 < l2 )
        {
            if ( arr1[ a1 ] < arr2[ a2 ] )
            {
                a1++;
            }
            else if ( arr1[ a1 ] > arr2[ a2 ] )
            {
                int temp = arr1[ a1 ];
                arr1[ a1 ] = arr2[ a2 ];
                arr2[ a2 ] = temp;
                Arrays.sort( arr2 );
                a1++;
            }
            else // == case
            {
                a1++;
                a2++;
            }
        }
        // while ( a1 == l1 && a2 < l2 )
        // {
        //
        // }
        // while ( a1 < l1 && a2 == l2 )
        // {
        //
        // }

        System.out.println( Arrays.toString( arr1 ) );
        System.out.println( Arrays.toString( arr2 ) );

    }
}
