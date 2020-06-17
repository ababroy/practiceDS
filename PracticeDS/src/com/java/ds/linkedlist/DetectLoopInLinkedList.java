package com.java.ds.linkedlist;

public class DetectLoopInLinkedList
{

    public static void main ( String[] args )
    {
        DetectLoopInLinkedList ll = new DetectLoopInLinkedList();
        Node head = null;
        // 1->2-> 3 -> 4 -> 2
        head = new Node( 1 );
        Node n2 = new Node( 2 );
        head.next = n2;
        Node n3 = new Node( 3 );
        n2.next = n3;
        Node n4 = new Node( 4 );
        n3.next = n4;
        n4.next = n2;

        // print(head);

        Node loop = ll.loopDetect( head );
        // System.out.println( loop.data );
        Node p = ll.removeLoop( loop, head );
        ll.print( p );
    }

    private Node removeLoop ( Node p, Node head )
    {
        Node q = head;
        while ( p != q )
        {
            p = p.next;
            q = q.next;
        }
        return p;
    }

    private Node loopDetect ( Node head )
    {
        if ( head == null )
        {
            return null;
        }
        Node p = head;
        Node q = head;

        while ( p != null && q != null && q.next != null )
        {
            p = p.next;
            q = q.next.next;
            if ( p == q )
            {
                return p;
            }
        }
        return null;
    }

    public void print ( Node head )
    {
        Node t = head;
        if ( t == null )
        {
            System.out.print( "Empty!!!" );
        }
        while ( t != null )
        {
            System.out.print( t.data + " -> " );
            t = head.next;
        }
        if ( t == null )
        {
            System.out.print( "NULL" );
        }
        System.out.println();
    }

}
