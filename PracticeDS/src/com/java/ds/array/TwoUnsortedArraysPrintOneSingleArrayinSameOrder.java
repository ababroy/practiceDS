package com.java.ds.array;

import java.util.Arrays;

public class TwoUnsortedArraysPrintOneSingleArrayinSameOrder
{
    /**
     * Two unsorted arrays print one single array with elements in same orders and sorted, remove duplicate. - E.g. [5,6,3,4,1]=>a & [2,4,9,7,1] => b - o/p: 134456 , 2,7,9
     * 
     */

    public static void main ( String[] args )
    {
        int a[] = { 5, 6, 3, 4, 1 }; // 1,3,4,5,6
        
        int b[] = { 2, 4, 9, 7, 1 }; // 2,7,9
        
        int res[] = new int[ a.length + b.length ];
        int r1 = 0;

        for ( int i = 0; i < a.length; i++ )
        {
            for ( int j = i + 1; j < a.length; j++ )
            {
                if ( a[ i ] > a[ j ] )
                {
                    int temp = a[ i ];
                    a[ i ] = a[ j ];
                    a[ j ] = temp;
                }
            }
        }

        for ( int i = 0; i < b.length; i++ )
        {
            for ( int j = i + 1; j < b.length; j++ )
            {
                if ( b[ i ] > b[ j ] )
                {
                    int temp = b[ i ];
                    b[ i ] = b[ j ];
                    b[ j ] = temp;
                }
            }
        }
        for ( int i = 0; i < a.length; i++ )
        {
            res[ r1 ] = a[ i ];
            r1++;
        }
        System.out.println( "r1: " + r1 );
        
        int b1 = 0;
        while ( b1 < b.length )
        {
            boolean flag = false;
            int a1 = 0;
            while ( a1 < a.length )
            {
                if ( b[ b1 ] == a[ a1 ] )
                {
                    b1++;
                    flag = true;
                    break;
                }
                a1++;
            }
            
            if ( !flag )
            {
                res[ r1 ] = b[ b1 ];
                r1++;
                b1++;
            }
        }

        System.out.println( Arrays.toString( res ) );
    }
}
