package com.java.io.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MergeTwoFilesData
{
    public static void main ( String[] args ) throws IOException
    {
        String strInput1 = new String( "sources\\input1.txt" );
        String strInput2 = new String( "sources\\input2.txt" );

        String output = new String( "sources\\output.txt" );

        Path path1 = Paths.get( strInput1 );

        Path path2 = Paths.get( strInput2 );

        List< String > file1 = Files.readAllLines( path1 );
        System.out.println( "File-1: " + file1 );
        List< String > file2 = Files.readAllLines( path2 );
        System.out.println( "File-2: " + file2 );

        file2.addAll( file1 );
        Collections.sort( file2, new IgnoreCase() );

        System.out.println( "Sorted File-2: " + file2 );

        try ( PrintWriter pw = new PrintWriter( new File( output ) ) )
        {
            Iterator< String > itr = file2.iterator();
            while ( itr.hasNext() )
            {
                pw.println( itr.next() );
            }
            pw.flush();
        }
    }

}

class IgnoreCase
    implements Comparator< String >
{
    @Override
    public int compare ( String o1, String o2 )
    {
        return o1.compareToIgnoreCase( o2 );
    }
}
