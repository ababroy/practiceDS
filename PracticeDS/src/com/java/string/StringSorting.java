package com.java.string;

/**
 * 
 * - BubbleSort finds the largest element first 
 * 
 * - InsertionSort finds the smallest element first
 * 
 * @author AROY
 *
 */
public class StringSorting
{
    public static void main ( String[] args )
    {
        String[] arr = { "doll", "apple", "rat", "volvo", "dim", "rose" };

        sortbyBubbleSort( arr );

        //sortbyInsertionSort( arr );

        for ( String str : arr )
        {
            System.out.print( str + " " );
        }
    }

    private static void sortbyInsertionSort ( String[] arr )
    {
       
    }

    private static void sortbyBubbleSort ( String[] arr )
    {
        String temp = null;
        for ( int i = 0; i < arr.length; i++ )
        {
            for ( int j = 0; j < ( arr.length - 1 ) - i; j++ ) // here "-i" reduces iteration for the last sorted elements
            {
                if ( arr[ j ].compareToIgnoreCase( arr[ j + 1 ] ) > 0 )
                {
                    temp = arr[ j + 1 ];
                    arr[ j + 1 ] = arr[ j ];
                    arr[ j ] = temp;
                }
            }
        }
    }

}
