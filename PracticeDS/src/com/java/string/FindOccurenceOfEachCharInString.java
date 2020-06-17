package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindOccurenceOfEachCharInString
{
    public static void main ( String[] args )
    {
        String str = "hello";

        usingCollection( str.toCharArray() );

    }

    private static void usingCollection ( char[] arr )
    {
        Map< Character, Integer > map = new LinkedHashMap<>();

        for ( char ch : arr )
        {
            int count = 1;
            if ( map.containsKey( ch ) )
            {
                count++;
            }
            map.put( ch, count );
        }

        for ( Entry< Character, Integer > entry : map.entrySet() )
        {
            System.out.println( entry.getKey() + "=" + entry.getValue() );
        }
    }
}
