package com.java.string;

import java.util.Arrays;

public class ReverseEachWordInString
{
    public static void main ( String[] args )
    {
        String str = "java code"; // avaj edoc

        // usingCharArray( str );
        usingSplitMethod( str );
    }

    /**
     * 
     * @param str
     */
    private static void usingSplitMethod ( String str )
    {
        String[] split = str.split( " " );

        for ( String st : split )
        {
            System.out.print( reverseArray( st.toCharArray(), 0, st.length() - 1 ) );
        }

    }

    /**
     * String str1 = "java code"; // avaj edoc
     * 
     * @param str
     */
    private static void usingCharArray ( String str )
    {
        char[] arr = str.toCharArray();

        int start = 0;
        int end = -1;

        for ( int i = 0; i < arr.length; i++ )
        {
            if ( arr[ i ] == ' ' )
            {
                end = i - 1;
                reverseArray( arr, start, end );
                start = i + 1;

            }
            if ( i == arr.length - 1 ) // for last word
            {
                end = i;
                reverseArray( arr, start, end );
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
