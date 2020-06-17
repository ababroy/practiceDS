package com.java.ds.array;

public class FindTheMissingNumber
{
    public static void main ( String[] args )
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };

        usingSumFormula( arr );
        usingXorFormula( arr );

    }

    private static void usingXorFormula ( int[] arr )
    {
        int xorArr = 0;
        int xorNum = 0;

        // Array nums
        for ( int i = 0; i < arr.length; i++ )
        {
            xorArr = xorArr ^ arr[ i ];
        }
        
        int fnum = arr[ 0 ];
        int lnum = arr[ arr.length - 1 ];
        // Ranges
        for ( int i = fnum; i <= lnum; i++ )
        {
            xorNum = xorNum ^ i;
        }
        System.out.println( xorArr ^ xorNum );
    }

    private static void usingSumFormula ( int[] arr )
    {
        int n = arr[ arr.length - 1 ];
        int sumOfNumbers = ( n * ( n + 1 ) ) / 2;
        System.out.println( "Sum of Numbers = " + sumOfNumbers );

        int sumOfarr = 0;

        for ( int i = 0; i < arr.length; i++ )
        {
            sumOfarr = sumOfarr + arr[ i ];
        }
        System.out.println( "Sum of Array = " + sumOfarr );
        System.out.println( "Missing number = " + ( sumOfNumbers - sumOfarr ) );
    }
}
