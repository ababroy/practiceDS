package com.java.ds.array.test;

import java.util.Arrays;

public class _MergeTwoSortedArray
{
    public static void main ( String[] args )
    {
        int arr1[] = { 1, 3, 5, 7, 9 };
        int arr2[] = { 2, 4, 8, 10, 11, 12, 16 };

        int[] res = new int[ arr1.length + arr2.length ];
        int r1 = 0;

        int a1 = 0;
        int l1 = arr1.length;
        int a2 = 0;
        int l2 = arr2.length;
        while ( a1 < l1 && a2 < l2 )
        {
            if ( arr1[ a1 ] < arr2[ a2 ] )
            {
                res[ r1 ] = arr1[ a1 ];
                r1++;
                a1++;
            }
            else if ( arr1[ a1 ] > arr2[ a2 ] )
            {
                res[ r1 ] = arr2[ a2 ];
                r1++;
                a2++;
            }
            else if ( arr1[ a1 ] == arr2[ a2 ] )
            {
                res[ r1 ] = arr1[ a1 ];
                r1++;
                a1++;
                a2++;
            }
        }
        while ( a1 == l1 && a2 < l2 )
        {
            res[ r1 ] = arr2[ a2 ];
            a2++;
            r1++;
        }
        while ( a1 < l1 && a2 == l2 )
        {
            res[ r1 ] = arr1[ a1 ];
            a1++;
            r1++;
        }
        
        System.out.println( Arrays.toString(res) );
        
    }

}
