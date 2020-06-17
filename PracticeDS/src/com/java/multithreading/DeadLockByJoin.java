package com.java.multithreading;


public class DeadLockByJoin
{
    public static void main(String[] args)
    {
        MyRun.thObj = Thread.currentThread();
        
        MyRun r1 = new MyRun();
        Thread t1 = new Thread(r1);
        t1.start();
        
        try
        {
            t1.join(); // dead lock by main thread
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        for(int i=0; i< 5; i++)
        {
            System.out.println("Executed by main thread...");
        }
    }
}

class MyRun implements Runnable
{
    static Thread thObj;
    
    public void run()
    {
        try
        {
            thObj.join();
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace(); 
        }
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Executed by Child Thread...");
        }

    }
}