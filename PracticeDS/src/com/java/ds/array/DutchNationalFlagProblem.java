package com.java.ds.array;

public class DutchNationalFlagProblem
{
    static int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

    public static void main ( String[] args )
    {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while ( mid <= high )
        {
            switch ( arr[ mid ] )
            {
                case 0:
                    swap( low, mid );
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(mid, high);
                    high--;
                    break;
            }
        }
        
        for(int i : arr)
        {
            System.out.print( i +" " );
        }
    }

    private static void swap ( int i, int j )
    {
        int temp =arr[ i ];
        arr[ i ] = arr[ j ];
        arr[ j ] = temp;
    }
}
