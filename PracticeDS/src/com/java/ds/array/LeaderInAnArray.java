package com.java.ds.array;

public class LeaderInAnArray
{
    static int arr[] = { 15, 16, 3, 2, 6, 1, 4 };

    public static void main ( String[] args )
    {
        simpleMethod( arr );       // O(n^2)
        maxFromRightMethod( arr ); // O(n)
    }

    private static void maxFromRightMethod ( int[] arr )
    {
        int n = arr.length;
        int mfr = arr[ n - 1 ];
        System.out.println( "leader = "+mfr );
        for( int i = n-2; i >= 0; i--)
        {
           if( mfr < arr[i])
           {
               System.out.println( "leader = "+ arr[i] );
               mfr = arr[i];
           }
        }
    }

    private static void simpleMethod ( int[] arr )
    {
        int n = arr.length;
        int i = 0;
        int j = 0;
        for ( i = 0; i < n; i++ )
        {
            for ( j = i + 1; j < n; j++ )
            {
                if ( arr[ i ] <= arr[ j ] )
                {
                    break;
                }
            }
            if ( j == n )
            {
                System.out.print( arr[ i ] + " " );
            }
        }
    }
}
