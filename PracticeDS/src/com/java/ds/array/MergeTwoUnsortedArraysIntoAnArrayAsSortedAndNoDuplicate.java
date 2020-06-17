package com.java.ds.array;

import java.util.Arrays;

public class MergeTwoUnsortedArraysIntoAnArrayAsSortedAndNoDuplicate
{
    public static void main ( String[] args )
    {
        /**
         * 2. Two unsorted arrays print one single array with elements in same orders and sorted, remove duplicate.
         * 
         * - E.g. [5,6,3,4,1]=>a & [2,4,9,7,1] => b
         * 
         * a[] = {10, 5, 15}, b[] = {20, 3, 2} o/p::=> {2, 3, 5, 10, 15, 20}
         * 
         */

        int[] a = {10, 5, 15}; //{ 5, 6, 3, 4, 1 };
        Arrays.sort(a);
        System.out.println( Arrays.toString( a ) );
        
        int[] b = {20, 3, 2}; //{ 2, 4, 9, 7, 1 };
        Arrays.sort(b);
        System.out.println( Arrays.toString( b ) );
        int[] res = new int[ a.length + b.length ];

        int a1 = 0;
        int b1 = 0;
        int r1 = 0;
        while ( a1 < a.length && b1 < b.length )
        {
            if ( a[ a1 ] < b[ b1 ] )
            {
                res[ r1 ] = a[ a1 ];
                r1++;
                a1++;
            }
            else if ( a[ a1 ] > b[ b1 ] )
            {
                res[ r1 ] = b[ b1 ];
                r1++;
                b1++;
            }
            else if ( a[ a1 ] == b[ b1 ] )
            {
                res[r1] = a[a1];
                r1++;
                a1++;
                b1++;
            }
        }

        while ( a1 == a.length && b1 < b.length )
        {
            res[ r1 ] = b[ b1 ];
            r1++;
            b1++;
        }
        while ( a1 < a.length && b1 == b.length )
        {
            res[ r1 ] = a[ a1 ];
            r1++;
            a1++;
        }

        System.out.println( Arrays.toString( res ) );
    }
}
