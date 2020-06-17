package com.java.ds.linkedlist;

public class MidElementOfLinkedList
{
    static Node head = null;

    public static void addLast ( int data )
    {
        Node f = head;

        if ( head == null )
        {
            head = new Node( data );
        }
        else if ( head.next == null )
        {
            head.next = new Node( data );
        }
        else
        {
            while ( head.next != null )
            {
                head = head.next;

                if ( head.next == null )
                {
                    head.next = new Node( data );
                    break;
                }

            }
        }
        head = f;

    }

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

        // print();
        addLast( 5 );
        print();

        findMidElement();

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
