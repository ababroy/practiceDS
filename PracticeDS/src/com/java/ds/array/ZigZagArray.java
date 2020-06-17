package com.java.ds.array;

import java.util.Arrays;

public class ZigZagArray
{
    public static void main ( String[] args )
    {
        int[] arr = { 3, 4, 6, 2, 1, 8, 9 }; // o/p: 3<6>2<4>1<9>8
        int n = arr.length;

        Boolean flag = false;
        int i = 0;
        while ( i < n - 1 )
        {
            if ( ( arr[ i ] < arr[ i + 1 ] && flag == false ) || ( arr[ i ] > arr[ i + 1 ] && flag == true ) )
            {
                // DO NOTHING
            }
            else
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            i++;
            flag = !flag;
        }
        
        System.out.println( Arrays.toString(arr) );
    }
}
