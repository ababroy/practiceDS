package com.java.string;

import java.util.Arrays;

public class ReplaceCharacterWithItsOccurance
{
    static String str = "opentext";

    static char c2r = 't';

    public static void main ( String[] args )
    {
        char[] arr = str.toCharArray();

        usingStringBuilder( arr );
        usingSameString( arr );
        usingReplaceFirst();
    }

    /**
     * Using ReplaceFirst method
     */
    private static void usingReplaceFirst ()
    {
        int count = 0;
        String newString = null;
        for ( int i = 0; i < str.length(); i++ )
        {
            char ch = str.charAt( i );

            if ( ch == c2r )
            {
                count++;
                newString = str.replaceFirst( String.valueOf( c2r ), String.valueOf( count ) );
            }
        }
        System.out.println( newString );
    }

    /**
     * On the same string
     * 
     * @param arr
     */
    private static void usingSameString ( char[] arr )
    {
        int count = 0;
        for ( int i = 0; i < arr.length; i++ )
        {
            if ( arr[ i ] == c2r )
            {
                count++;
                arr[ i ] = ( "" + count ).charAt( 0 );
                // arr[ i ] = String.valueOf( count ).charAt( 0 );
            }
        }
        System.out.println( Arrays.toString( arr ) );
    }

    /**
     * Using StringBuilder
     * 
     * @param arr
     */
    private static void usingStringBuilder ( char[] arr )
    {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < arr.length; i++ )
        {
            if ( arr[ i ] == c2r )
            {
                count++;
                sb.append( count );
            }
            else
            {
                sb.append( arr[ i ] );
            }
        }

        System.out.println( sb );
    }

}
