package com.java.ds.array.test;

public class _FindTheMissingNumber
{
    public static void main ( String[] args )
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };

        //usingSumFormula( arr );
        usingXorFormula( arr );

    }

    private static void usingXorFormula ( int[] arr )
    {
        int xarr = 0;
        for( int i =0; i< arr.length; i++)
        {
            xarr = xarr ^ arr[i];
        }
        System.out.println( "xarr: "+xarr );
        
        int xnum = 0;
        for(int a =0; a < arr[arr.length-1]; a++ )
        {
            xnum = xnum + arr[0];
        }
        System.out.println( "xnum: "+xnum );
        System.out.println( "Missing number is " + (xarr - xnum) );    
    }

    private static void usingSumFormula ( int[] arr )
    {
        int n = arr[arr.length-1];
        int son = (n * (n+1))/2;
        System.out.println( "SON: "+son );
        
        int soa = 0;
        for( int i =0; i< arr.length; i++)
        {
            soa = soa + arr[i];
        }
        System.out.println( "SOA: "+soa );
        
        System.out.println( "Missing number is " + (son-soa) );
    }
}
