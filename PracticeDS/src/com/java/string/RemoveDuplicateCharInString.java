package com.java.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharInString
{
    public static void main ( String[] args )
    {
        String str = "programming";

        /*
         * 1. Using Java 8
         */
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach( c -> sb.append( ( char ) c ) );
        System.out.println( "Sb1: " + sb );
        /*
         * 2. using indexOf(..)
         */
        StringBuilder sb2 = new StringBuilder();

        for ( int i = 0; i < str.length(); i++ )
        {
            char ch = str.charAt( i );
            int index = str.indexOf( ch, i + 1 );
            if ( index == -1 )
            {
                sb2.append( ch );
            }
        }
        System.out.println( "Sb2: " + sb2 );

        /*
         * 3. Using Character Array String str = "programming";
         */
        StringBuilder sb3 = new StringBuilder();
        char charr[] = str.toCharArray();
        
        for ( int i = 0; i < charr.length; i++ )
        {
            boolean flag = false;
            for ( int j = i + 1; j < charr.length; j++ )
            {
                if ( charr[ i ] == charr[ j ] )
                {
                    flag = true;
                    break;
                }
            }
            if ( flag == false )
            {
                sb3.append( charr[ i ] );
            }
        }
        System.out.println( "Sb3: " + sb3 );

        /*
         * 4. Using Set interface method
         */
        StringBuilder sb4 = new StringBuilder();
        Set< Character > set = new LinkedHashSet<>();

        for ( int i = 0; i < str.length(); i++ )
        {
            set.add( str.charAt( i ) );
        }
        for ( char ch : set )
        {
            sb4.append( ch );
        }
        System.out.println( "Sb4: " + sb4 );
    }
}
