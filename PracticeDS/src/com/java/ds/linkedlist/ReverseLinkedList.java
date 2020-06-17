package com.java.ds.linkedlist;

public class ReverseLinkedList
{

    static Node head = null;

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

        Node rev = reverseLinkedList();
        print( rev );
    }

    /* 1->2->3->4->NULL => 4->3->2->1->NULL */
    private static Node reverseLinkedList ()
    {
        if ( head == null )
        {
            System.out.println( "empty" );
        }
        Node c = head;
        Node p = null;
        Node n = null;
        while ( c != null )
        {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }

    public static void print ()
    {
        Node temp = head;
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
        head = temp;
        System.out.println();
    }

    public static void print ( Node head )
    {
        Node temp = head;
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
        head = temp;
        System.out.println();
    }

}
