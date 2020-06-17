package com.java.ds.array;

public class SubarrayWithGivenSum
{
    static int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//{ 1, 2, 3, 7, 5 };

    static int targetVal = 151; //12;

    public static void main ( String[] args )
    {
        int start = 0;
        int end = 0;
        loopAgain(start, end);
    }

    public static void loopAgain (int start, int end)
    {
        int sum = 0;
        boolean flag = false;
        
        for ( int i = start; i < arr.length; i++ )
        {
            sum = sum + arr[ i ];
            end = i;
            if( sum > targetVal) break;
            if ( sum == targetVal )
            {
                System.out.println( "index:"+ start + " " + end );
                flag=true;
                return;
                
            }
        }
        
        if ( start < arr.length - 1 )
        {
            start = start + 1;
            end = start;
           loopAgain(start, end);
           
        }
        
        if(flag == false ) System.out.println( "No match found!" );
    }
}
