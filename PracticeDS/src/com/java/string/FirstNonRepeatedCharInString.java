package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharInString
{
    public static void main ( String[] args )
    {
        String str = "aabcdbe";
        char[] arr = str.toCharArray();

        usingLoop( arr );
        usingCollection( arr );
    }

    private static void usingCollection ( char[] arr )
    {
        Map< Character, Integer > map = new LinkedHashMap<>();
        for ( char c : arr )
        {
            int count = 1;
            if ( map.containsKey( c ) )
            {
                count = map.get( c );
                count++;
            }
            map.put( c, count );
        }

        System.out.println( map );

        for ( Entry< Character, Integer > entry : map.entrySet() )
        {
            if ( entry.getValue() == 1 )
            {
                System.out.println( "First NonRepeated Char in String: " + entry.getKey() );
                break;
            }
        }

        // Set< Entry< Character, Integer > > set = map.entrySet();
        // Iterator< Entry< Character, Integer > > itr = set.iterator();
        //
        // while ( itr.hasNext() )
        // {
        // Entry< Character, Integer > entry = itr.next();
        // if ( entry.getValue() == 1 )
        // {
        // System.out.println( "First NonRepeated Char in String: " + entry.getKey() );
        // break;
        // }
        // }
    }

    private static void usingLoop ( char[] arr )
    {
        for ( int i = 0; i < arr.length; i++ )
        {
            boolean flag = false;
            for ( int j = 0; j < arr.length; j++ )
            {
                if ( arr[ i ] == arr[ j ] && ( i != j ) )
                {
                    flag = true;
                    break;
                }
            }
            if ( !flag )
            {
                System.out.println( "First NonRepeated Char in String: " + arr[ i ] );
                break;
            }

        }
    }
}
