package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter
{

    public static void main ( String[] args )
    {
        String str = "abbac"; // bac
        // String str = "abcabcbb"; // abc
        // String str = "java"; // jav
        // String str = "abcddooprmmomnopq";

        longestSubstring( str );

    }

    private static void longestSubstring ( String str )
    {
        String lsub = null;
        int len = 0;
        Map< Character, Integer > map = new LinkedHashMap<>();
        char[] arr = str.toCharArray();

        for ( int i = 0; i < arr.length; i++ )
        {
            char ch = arr[ i ];
            if ( !map.containsKey( ch ) )
            {
                map.put( ch, i );
            }
            else
            {
                i = map.get( ch );
                map.clear();
            }

            if ( map.size() > 0 )
            {
                len = map.size();
                lsub = map.keySet().toString();
            }
        }

        System.out.println( "The longest substring: " + lsub );
        System.out.println( "The longest substring length: " + len );
    }

}
