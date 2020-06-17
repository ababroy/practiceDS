package com.java.ds.array;

import java.util.Arrays;

public class KthMinMaxElement
{
    public static void main ( String[] args )
    {
        int[] arr = { 5, 8, 12, 7, 6, 2, 4 }; 
         Arrays.sort( arr );
        int kTh = 5;

        kThSmallestElement( arr, kTh ); // 2,4,5,6,[7],8,12
        kThLargestElement( arr, kTh ); // 12,8,7,6,[5],4,2
    }

    private static void kThLargestElement ( int[] arr, int kTh )
    {
        for ( int i = 0; i < arr.length; i++ )
        {
            for ( int j = i + 1; j < arr.length; j++ )
            {
                if ( arr[ i ] < arr[ j ] )
                {
                    int temp = arr[ i ];
                    arr[ i ] = arr[ j ];
                    arr[ j ] = temp;
                }
            }
            
            if(kTh-1 == i)
            {
                System.out.println( arr[i] );
                break;
            }
        }
    }

    private static void kThSmallestElement ( int[] arr, int kTh )
    {
        for ( int i = 0; i < arr.length; i++ )
        {
            for ( int j = i + 1; j < arr.length; j++ )
            {
                if ( arr[ i ] > arr[ j ] )
                {
                    int temp = arr[ i ];
                    arr[ i ] = arr[ j ];
                    arr[ j ] = temp;
                }
            }

            if ( i == kTh - 1 )
            {
                System.out.println( arr[ i ] );
                break;
            }
        }
    }

}
