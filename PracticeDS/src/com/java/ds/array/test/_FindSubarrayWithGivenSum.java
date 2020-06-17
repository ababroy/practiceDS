package com.java.ds.array.test;

/**
 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 * 
 * Ouptut: Sum found between indexes 2 and 4 Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
 * 
 * 
 * Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
 * 
 * Ouptut: Sum found between indexes 1 and 4 Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
 * 
 * 
 * Input: arr[] = {1, 4}, sum = 0
 * 
 * Output: No subarray found There is no subarray with 0 sum
 *
 * 
 */
public class _FindSubarrayWithGivenSum
{
    public static void main ( String[] args )
    {
        /**
         * Non-negative
         */
        // int arr[] = { 1, 4, 20, 3, 10, 5 }; // 2,4
        // int target = 33;
         int arr[] = { 1, 4 };
         int target = 0;
        // int arr[] = {1, 4, 0, 0, 3, 10, 5};
        // int target = 7;

        /**
         * Negative
         */
        // int arr[] = {10, 2, -2, -20, 10}; //
        // int target = -10;

        // int arr[] = { -10, 0, 2, -2, -20, 10 }; // no match found
        // int target = 20;

        int start = 0;
        int end = 0;
        int sum = 0;
        boolean flag = false;

        for ( int i = 0; i < arr.length; i++ )
        {
            start = i;
            for ( int j = i; j < arr.length; j++ )
            {
                sum = sum + arr[ j ];
                if ( sum == target )
                {
                    flag = true;
                    end = j;
                    break;
                }
                if ( sum > target )
                {
                    sum = 0;
                    break;
                }
            }
            if ( flag )
                break;
        }

        if ( flag )
            System.out.println( start + " , " + end );
        else
            System.out.println( "No match found" );

    }
}
