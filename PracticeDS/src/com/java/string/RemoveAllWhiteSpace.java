package com.java.string;

public class RemoveAllWhiteSpace
{
    public static void main ( String[] args )
    {
        String str ="         j  a   va   s  ta     r       ";
        System.out.println( "String length "+str.length());
        System.out.println( str.trim() );
        System.out.println( str.replaceAll( "\\s", "" ));
    }
}
