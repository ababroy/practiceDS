package com.java.ds.linkedlist;

public class LastElementSwapWithFirstPosition
{

    static Node head = null;

    public static void main ( String[] args )
    {
        head = new Node( 1 );
        addLast( 2 );
        addLast( 3 );
        addLast( 4 );
        addLast( 5 );
        addLast( 6 );
        print();
        lastElementSwapWithFirstPosition();
        print();
    }
    
    
    private static void lastElementSwapWithFirstPosition ()
    {
        Node temp = head;
        
        if(temp == null)
        {
            System.out.println( "Empty" );
            return;
        }
        while(temp != null)
        {
            if( temp.next == null)
            {
                int t = head.data;
                head.data = temp.data;
                temp.data = t;
            }
            temp = temp.next;
        }
    }


    public static void addLast ( int data )
    {
        Node temp = head;

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
        head = temp;

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

}
