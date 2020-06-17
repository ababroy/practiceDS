package com.java.ds.array;

public class ReverseAnArrayWithoutExtraSpace
{
    static int arr[] = { 8, 7, 6, 5, 4, 3, 2, 1 ,0};

    public static void main ( String[] args )
    {
        int start = 0;
        int end  = arr.length-1;
        
        while( start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start+=1;
            end-=1;
                
        }
        
        for(int i: arr)
        {
            System.out.print( i+" " );
        }
        
        
        // arr[start] = arr[start]+arr[end] - (arr[start]=arr[end]);
        // arr[end] = arr[start]-arr[end];
    }
}
