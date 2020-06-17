package com.java.ds.array;

public class RemoveDuplicateFromTheArray
{
    static int arr[] = {1,1,1,1,1,2,2,2,2,3,3,4,5}; //{ 1, 1, 2 }; // {1,1,1,2,2,2,3,3,4};

    public static void main ( String[] args )
    {
        int len = arr.length;
        int count = 1;
        int sameVal = arr[0];
        for ( int i = 0; i < len; i++ )
        {
            if( sameVal == arr[i] )
            {
                continue;
            }
            else
            {
                sameVal = arr[i];
                count = count +1;
            }
            
        }

        System.out.println( count );
    }
}
