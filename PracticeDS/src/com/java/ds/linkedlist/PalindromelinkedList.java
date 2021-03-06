package com.java.ds.linkedlist;

/* Java program to check if linked list is palindrome recursively */
import java.util.*;

public class PalindromelinkedList
{
    public static void main ( String args[] )
    {
        Node one = new Node( 1 );
        Node two = new Node( 2 );
        Node three = new Node( 3 );
        Node four = new Node( 4 );
        Node five = new Node( 3 );
        Node six = new Node( 2 );
        Node seven = new Node( 1 );
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean condition = isPalindrome( one );
        System.out.println( "isPalidrome :" + condition );
    }

    static boolean isPalindrome ( Node head )
    {
        Node slow = head;
        boolean ispalin = true;
        Stack< Integer > stack = new Stack< Integer >();

        while ( slow != null )
        {
            stack.push( slow.data );
            slow = slow.next;
        }

        while ( head != null )
        {

            int i = stack.pop();
            if ( head.data == i )
            {
                ispalin = true;
            }
            else
            {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }
}
