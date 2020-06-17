package com.java.ds.array;

import java.util.Arrays;

public class SortTwoArraysWithoutExtraSpace
{
    public static void main ( String[] args )
    {
        int arr1[] = { 1, 3, 5, 7, 9 }; // 1,2,3,4,5
        int arr2[] = { 2, 4, 8, 10, 11, 12, 16 }; // 7,8,9,10,11,12,16
        for(int a1 : arr1)
        {
            System.out.print( a1 +" ");
        }
        System.out.println(  );
        for(int a2 : arr2)
        {
            System.out.print( a2 +" " );
        }
        System.out.println(  );
        System.out.println( "*****************" );
        int len1 = arr1.length;
        int len2 = arr2.length;

        int i = 0, j = 0;

        while ( i < len1 && j < len2 )
        {
            if( arr1[i] < arr2[j])
            {
                i++;
            }
            else if( arr1[i] > arr2[j])
            {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                Arrays.sort(arr2);
                i++;
            }
        }
        
        for(int a1 : arr1)
        {
            System.out.print( a1  +" ");
        }
        System.out.println(  );
        for(int a2 : arr2)
        {
            System.out.print( a2 +" " );
        }
    }
}
