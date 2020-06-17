package com.java.ds.array;

public class MergeTwoSortedArray
{
    public static void main(String[] args)
    {
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,8,10,11,12,16};
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        int res[] = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while( i < len1 && j < len2)
        {
            if( arr1[i] < arr2[j])
            {
                res[k] = arr1[i];
                k++;
                i++;
            }
            else if(arr1[i] > arr2[j])
            {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }
        while( i == len1 && j <len2)
        {
            res[k] = arr2[j];
            k++;
            j++;
        }
        while( i<len1 && j == len2)
        {
            res[k] = arr1[i];
            k++;
            i++;
        }
        
        for(int a : res)
        {
            System.out.print( a +" ");
        }
        
    }


}
