package com.java.ds.array;

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
public class FindSubarrayWithGivenSum
{
    public static void main ( String[] args )
    {
        /**
         * Non-negative
         */
        // int arr[] = { 1, 4, 20, 3, 10, 5 };
        // int target = 33;
        // int arr[] = { 1, 4 };
        // int target = 0;
        // int arr[] = {1, 4, 0, 0, 3, 10, 5};
        // int target = 7;
        
        /**
         * Negative 
         */
        // int arr[] = {10, 2, -2, -20, 10};
        // int target = -10;
        
        int arr[] = {-10, 0, 2, -2, -20, 10};
        int target =20;

        int start = 0;
        int end = 0;
        int sum = 0;
        int index = 0;
        boolean flag = false;
        while ( index < arr.length )
        {
            sum = sum + arr[ index ];
            end = index;
            index++;
            if ( sum == target )
            {
                flag = true;
                break;
            }
            if ( sum > target )
            {
                start++;
                index = start;
                sum = 0;
            }
        }
        if ( flag )
        {
            System.out.println( "Start index: " + start + " \nEnd index: " + end );
        }
        else
        {
            System.out.println( "No subarray found There is no subarray with 0 sum" );
        }

    }
}
