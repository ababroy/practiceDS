package com.java.ds.array.test;

public class _MaxSumSubArray_KadanesAlgo
{
    public static void main ( String[] args )
    {
        int[] arr = { 4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2 };

        int maxSoFar = arr[ 0 ];
        int maxEndHere = 0;

        int start = 0;
        int end = 0;
        int search = 0;
        for ( int i = 0; i < arr.length; i++ )
        {
            maxEndHere = maxEndHere + arr[ i ];
            if ( maxSoFar < maxEndHere )
            {
                maxSoFar = maxEndHere;
                start = search;
                end = i;
            }
            if ( maxEndHere < 0 )
            {
                maxEndHere = 0; // reset
                search = i + 1;
            }
        }
        
        System.out.println( start+","+end );
    }

}
