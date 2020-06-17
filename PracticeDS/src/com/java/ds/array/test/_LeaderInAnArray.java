package com.java.ds.array.test;

public class _LeaderInAnArray
{
    public static void main ( String[] args )
    {
        int arr[] = { 15, 16, 3, 2, 6, 1, 4 }; // 15 < 16b // 16 < 3
        simpleMethod( arr ); // O(n^2)
        maxFromRightMethod( arr ); // O(n)
    }

    private static void maxFromRightMethod ( int[] arr )
    {
        int n = arr.length;
        int mfr = arr[n-1];
        
        for( int i = n-1; i> 0; i--)
        {
            if( arr[i] >= mfr)
            {
                System.out.print( arr[i]+ "," );
                mfr =  arr[i];
            }
        }
    }

    private static void simpleMethod ( int[] arr )
    {
        boolean flag = false;
        for ( int i = 0; i < arr.length - 1; i++ )
        {
            if ( arr[ i ] < arr[ i + 1 ] )
            {
                continue;
            }
            else
            {

                for ( int j = i + 1; j < arr.length; j++ )
                {
                    if ( arr[ i ] > arr[ j ] )
                    {
                        flag = true;
                    }
                    else
                    {
                        flag = false;
                        break;
                    }
                }

            }
            if ( flag )
            {
                System.out.print( arr[ i ] + " " );
            }
        }
        System.out.println( arr[ arr.length - 1 ] );
    }
}
