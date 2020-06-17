package com.java.ds.linkedlist;

public class FindLengthOfLinkedList
{

    static Node head = null;

    public static void print ()
    {
        Node f = head;
        if ( head == null )
        {
            System.out.print( "Empty!!!" );
        }
        else
        {
            while ( head != null )
            {
                System.out.print( head.data + " -> " );
                head = head.next;
            }
            if ( head == null )
            {
                System.out.print( "NULL" );
            }
        }
        head = f;
        System.out.println();
    }

    public static void main ( String[] args )
    {
        head = new Node( 1 );
        Node n2 = new Node( 2 );
        head.next = n2;
        Node n3 = new Node( 3 );
        n2.next = n3;
        Node n4 = new Node( 4 );
        n3.next = n4;

        print();

        System.out.println( "Count: " + countOfElements() );

        // findMidElement();

    }

    private static int countOfElements ()
    {
        Node temp = head;
        int count= 0;
        if ( head == null )
        {
            return count;
        }
        else
        {
            
            while( temp != null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    private static void findMidElement ()
    {
        Node f = head;
        Node s = head;

        if ( f == null )
        {
            System.out.println( "Empty" );
            return;
        }

        while ( s != null && s.next != null )
        {
            f = f.next;
            s = s.next.next;
        }
        System.out.println( f.data );
    }

}
