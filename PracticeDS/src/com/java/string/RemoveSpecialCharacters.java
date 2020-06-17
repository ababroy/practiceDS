package com.java.string;

public class RemoveSpecialCharacters
{
    // a=97
    // z=122
    // A=65
    // Z=90
    public static void main ( String[] args )
    {
        String str = "$ja!va$&st%ar";

        /*
         * Using ASCII value of alphabets
         */
        char[] arr = str.toCharArray();
        for ( char s : arr )
        {
            if ( (( int ) s >= ( int ) 'A' && ( int ) s <= ( int ) 'Z' ) || (( ( int ) s >= ( int ) 'a' && ( int ) s <= ( int ) 'z' )))
            {
                System.out.print( s );
            }
        }
        System.out.println(  );
        /*
         * Using replaceAll(regex,"replacement_word") method
         */
        
        str = str.replaceAll( "[^a-zA-Z0-9]", "" );
        System.out.println( str );
    }
}
