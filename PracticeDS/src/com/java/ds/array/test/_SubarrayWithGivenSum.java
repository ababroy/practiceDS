package com.java.ds.array.test;

public class _SubarrayWithGivenSum
{
    static int arr[] = { 1, 2, 3, 7, 5 };

    static int targetVal = 12;

    public static void main ( String[] args )
    {
        int n = arr.length;
        int sum = 0;
        int s = 0;
        int e = 0;
        boolean flag = false;
        int i = 0;
        // for ( int i = 0; i < n; i++ )
        while ( i < n )
        {
            sum = sum + arr[ i ];
            e = i;
            i++;
            if ( sum == targetVal )
            {
                flag = true;
                break;
            }
            if ( sum > targetVal )
            {
                sum = 0;
                s++;
                i = s;
            }
        }

        if ( flag == true )
            System.out.println( "Start: " + s + " end: " + e );
        else
        {
            System.out.println( "No match found!!!" );
        }
    }

}
