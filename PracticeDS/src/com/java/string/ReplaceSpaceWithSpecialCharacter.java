package com.java.string;

public class ReplaceSpaceWithSpecialCharacter
{
    public static void main ( String[] args )
    {
        String strInput = "There is a horse    ";
        int strTrim = strInput.trim().length();
        System.out.println( "Before String Value: " + strInput );
        System.out.println( "Before String length: " + strInput.length() );
        StringBuilder sb = new StringBuilder();
        char[] arr = strInput.toCharArray();
        int len = arr.length;
        for ( int i = 0; i < len; i++ )
        {
            if ( arr[ i ] == ' ' && i < strTrim )
            {
                sb.append( "<>" );
                len--;
            }
            else
            {
                sb.append( arr[ i ] );
            }
        }
        System.out.println( "After String Value: " + sb );
        System.out.println( "After String length: " + sb.length() );
    }
}
