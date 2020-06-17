package com.java.string;

import java.util.Arrays;

public class ReverseStringWithoutReversingAnyWord
{
    public static void main ( String[] args )
    {
        String str = "My name is Abhi"; // [A, b, h, i, , i, s, , n, a, m, e, , M, y]
        usingCharArray( str );
        
        
    }

    

    /**
     * String str = "My name is Abhi"; // [A, b, h, i, , i, s, , n, a, m, e, , M, y]
     * 
     * @param str
     */
    private static void usingCharArray ( String str )
    {
        char[] arr = str.toCharArray();

        arr = reverseArray( arr, 0, arr.length - 1 );
        System.out.println( Arrays.toString( arr ) );

        int start = 0;
        int end = -1;

        for ( int i = 0; i < arr.length; i++ )
        {
            if ( ( arr[ i ] == ' ' ) )
            {
                end = i - 1;
                arr = reverseArray( arr, start, end );
                if ( start < arr.length )
                    start = i + 1;
            }
            if ( ( i == arr.length - 1 ) )
            {
                end = i;
                arr = reverseArray( arr, start, end );
            }

        }

        System.out.println( Arrays.toString( arr ) );

    }

    private static char[] reverseArray ( char[] arr, int start, int end )
    {
        while ( start < end )
        {
            char temp = arr[ start ];
            arr[ start ] = arr[ end ];
            arr[ end ] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
