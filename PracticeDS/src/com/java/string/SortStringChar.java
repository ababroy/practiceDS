package com.java.string;

public class SortStringChar
{
    static String str ="java";
    
    public static void main ( String[] args )
    {
        char[] ch = str.toCharArray();
        for(int i=0; i< ch.length; i++)
        {
            for( int j = i+1; j< ch.length; j++)
            {
                if(ch[i] > ch[j])
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        for(char c : ch)
        {
            System.out.print( c );
        }
    }
}
