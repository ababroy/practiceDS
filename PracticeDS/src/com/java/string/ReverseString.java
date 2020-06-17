package com.java.string;

public class ReverseString
{
    public static void main ( String[] args )
    {
        String str = "Abhijit Roy";
        
        /*
         * toCharArray method  
         */
        char[] charArray = str.toCharArray();
        System.out.println( "Using toCharArray() method..." );
        for( int i = str.length()-1 ; i>=0; i--)
        {
            System.out.print( charArray[i] );
        }
        System.out.println(  );
        System.out.println( "Using charAt(int index) method..." );
        /*
         * charAt(int index) method
         * 
         */
        for( int index = str.length()-1; index>=0; index--)
        {
            System.out.print( str.charAt( index ) );
        }
        
        /*
         * StringBuffer reverse method
         */
        System.out.println(  );
        System.out.println( "Using StringBuffer reverse method..." );
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println( stringBuffer );
        
        
        /*
         * StringBuilder reverse method
         */
        System.out.println( "Using StringBuilder reverse method..." );
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println( stringBuilder );
        
    }
}
