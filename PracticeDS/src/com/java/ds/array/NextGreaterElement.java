package com.java.ds.array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement
{
    public static void main ( String[] args )
    {
        int[] arr = { 5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4 };
        int[] narr = new int[ arr.length ];
        Stack< Integer > st = new Stack<>();
        int k = 0;
        int last = 0;

        // for ( int i = 0; i < arr.length; i++ )
        // {
        // if ( i == 0 )
        // {
        // st.push( arr[ i ] );
        // last = i;
        // }
        // else if ( arr[ last ] > arr[ i ] )
        // {
        // st.push( arr[ i ] );
        // }
        // else
        // {
        // last = i;
        // while ( !st.isEmpty() )
        // {
        // int pop = st.pop();
        // if ( pop < arr[last] )
        // {
        // narr[ k ] = arr[last];
        // k++;
        // }
        // }
        // st.push( arr[last] );
        // }
        //
        // }

        System.out.println( Arrays.toString( narr ) );
    }
}
