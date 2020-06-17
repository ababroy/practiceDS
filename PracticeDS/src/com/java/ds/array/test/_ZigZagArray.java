package com.java.ds.array.test;

import java.util.Arrays;

public class _ZigZagArray
{
    public static void main ( String[] args )
    {
        int[] arr = { 3, 4, 6, 2, 1, 8, 9 }; // o/p: 3<6>2<4>1<9>8
        int n = arr.length;
        boolean flag = false;

        int i = 0;
        while ( i < n - 1 )
        {
            if ( ( flag == false && arr[ i ] < arr[ i + 1 ] ) || ( flag == true && arr[ i ] > arr[ i + 1 ] ) )
            {
                // Do nothing
            }
            else
            {
                int temp = arr[ i ];
                arr[ i ] = arr[ i + 1 ];
                arr[ i + 1 ] = temp;
            }
            i++;
            flag = !flag;
        }

        System.out.println( Arrays.toString( arr ) );
    }
}
