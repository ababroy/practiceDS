package com.java.ds.array;

public class MaxSumSubArray_KadanesAlgo
{
    public static void main ( String[] args )
    {
        int[] arr = {-10,1,2,3,-7,4,-20};//{ 4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2 };
        //                       2+3+1-2-3+4+2
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

            if ( maxEndHere < 0 ) // resetting negative value => zero
            {
                maxEndHere = 0;
                search = i + 1;
            }
        }

        System.out.println( maxSoFar );
        System.out.println( "start_index: " + start + " || end-index: " +end +" Length: "+ (end+1-start) );
    }
    
}
