package com.java.ds.array;

/**
 * 1. Make two parts of the array as (n-r) and r
 * 
 * 2. Reverse part1 and part2 = Part1reverse Part2reverse
 * 
 * 3. Reverse whole Part1reverse.Part2reverse
 * 
 * @author AROY
 *
 */
public class RotationOfAnArray
{
    static int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // {5,4,3,2,1,7,6} // {6,7,1,2,3,4,5}

    static int rotate = 2;

    public static void main ( String[] args )
    {
        int n = arr.length; // 7
        int r = rotate; // 2

        /* reverse of arr(n-r) */
        int s = 0;
        int e = ( n - r ) - 1; // 7-2 = 5
        reverseArray( s, e );

        /* reverse r */
        s = ( n - r );
        e = n - 1;
        reverseArray( s, e );

        for ( int a : arr )
        {
            System.out.print( a + " " );
        }
        System.out.println();
        /* Whole array reverse */
        reverseArray( 0, n - 1 );
        for ( int a : arr )
        {
            System.out.print( a + " " );
        }
    }

    public static void reverseArray ( int s, int e )
    {
        while ( s < e )
        {
            int temp = arr[ s ];
            arr[ s ] = arr[ e ];
            arr[ e ] = temp;
            s += 1;
            e -= 1;
        }
    }
}
