package com.java.ds.linkedlist;

public class LastElementToFirstPosition
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
        lastElementToFirstPosition();
        print();
    }
    
    
    private static void lastElementToFirstPosition ()
    {
        Node temp = head;
        
        if(temp == null)
        {
            System.out.println( "Empty" );
            return;
        }
        while(temp != null)
        {
            Node prev =null;
            if( temp.next.next == null)
            {
                prev = temp;
                Node t = temp.next;
                prev.next = null;
                t.next = head;
                head = t;
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
