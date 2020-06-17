package com.java.multithreading;

import java.util.Stack;

public class ProducerConsumer
{
    public static void main ( String[] args )
    {
        Items items = new Items( 10 );

        Producer pro = new Producer( items );
        Thread pt = new Thread( pro, "producer-thread" );

        Consumer con = new Consumer( items );
        Thread ct = new Thread( con, "consumer-thread" );

        pt.start();
        ct.start();
    }
}

class Items
{
    int maxItems;

    private int data = 1;

    private final Object lock = new Object();

    Items ( int maxItems )
    {
        this.maxItems = maxItems;
    }

    Stack< Integer > items = new Stack<>();

    public void producer()
    {
        synchronized(lock)
        {
            while( true)
            {
                if(items.size() <= maxItems)
                {
                    // produce items
                    System.out.println(Thread.currentThread().getName()+"="+items.push(data++));
                    
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ie)
                    {
                        ie.printStackTrace();
                    }
                    lock.notify();
                }
                else
                {
                    try
                    {
                        lock.wait();
                    }
                    catch(InterruptedException ie)
                    {
                        ie.printStackTrace();
                    }
                }
            }
        }
    }

    public void consumer ()
    {
        synchronized ( lock )
        {
            while ( true )
            {
                if ( items.size() != 0 )
                {
                    // consume items
                    System.out.println( Thread.currentThread().getName() + "=" + items.pop() );

                    try
                    {
                        Thread.sleep( 1000 );
                    }
                    catch ( InterruptedException ie )
                    {
                        ie.printStackTrace();
                    }
                    lock.notify();
                }
                else
                {
                    try
                    {
                        lock.wait();
                    }
                    catch ( InterruptedException ie )
                    {
                        ie.printStackTrace();
                    }
                }
            }
        }
    }
}

class Producer
    implements Runnable
{
    Items items;

    Producer ( Items i )
    {
        this.items = i;
    }

    @Override
    public void run ()
    {
        items.producer();
    }
}

class Consumer
    implements Runnable
{
    Items items;

    Consumer ( Items i )
    {
        this.items = i;
    }

    @Override
    public void run ()
    {
        items.consumer();
    }
}
