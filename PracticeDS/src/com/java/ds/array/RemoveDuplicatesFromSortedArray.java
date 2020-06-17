package com.java.ds.array;

public class RemoveDuplicatesFromSortedArray
{
//    static int arr[] = { 1, 2, 2, 3, 3, 3, 4, 4 };

     static int arr[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5 };

    public static void main ( String[] args )
    {
        // usingExtraSpace(arr);
        usingConstantSpace( arr );
    }

    private static void usingConstantSpace ( int arr[] )
    {
        int k = 0;
        for ( int i = 0; i < arr.length -1; i++ )
        {
            if ( arr[ i ] != arr[ i + 1 ] )
            {
                arr[k] = arr[i];
                k++;
            }
        }
        arr[k] = arr[arr.length-1];
        
        for ( int a = 0; a <= k; a++ )
        {
            System.out.print( arr[ a ] + " " );
        }
    }

    private static void usingExtraSpace ( int arr[] )
    {
        int res[] = new int[ arr.length ];
        int k = 0;

        for ( int i = 0; i < arr.length - 1; i++ )
        {
            if ( arr[ i ] != arr[ i + 1 ] )
            {
                res[ k ] = arr[ i ];
                k++;
            }
        }

        res[ k ] = arr[ arr.length - 1 ];

        for ( int a = 0; a <= k; a++ )
        {
            System.out.print( res[ a ] + " " );
        }
    }

}
