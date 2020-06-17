package com.java.ds.array.test;

import java.util.Arrays;

public class _MergeTwoUnsortedArraysIntoAnArrayAsSortedAndNoDuplicate
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

        int[] arr1 = { 5, 6, 3, 4, 1 }; // {10, 5, 15}; //
        Arrays.sort(arr1);
        int[] arr2 = { 2, 4, 9, 7, 1 }; // {20, 3, 2}; //
        Arrays.sort(arr2);
        
        int[] res = new int[ arr1.length + arr2.length ];
        int r1 = 0;

        int a1 = 0;
        int l1 = arr1.length;
        int a2 = 0;
        int l2 = arr2.length;
        
        int newLength = l1+l2;
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
                newLength--;
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
        
       for(int i=0; i< newLength; i++)
       {
           System.out.print( res[i] +" ");
       }
        
    }
}
