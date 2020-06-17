package com.java.multithreading;

public class DeadLockBySynchronized extends Thread
{
    A a = new A();
    B b = new B();
        
    public void run()
    {
        a.method1(b); // child thread will execute this code
    }
    
    void call()
    {
        this.start(); // child is responsible 
        b.method2(a); // main thread is responsible
    }
    public static void main(String[] args)
    {
        DeadLockBySynchronized obj = new DeadLockBySynchronized();
        obj.call();
    }
}

class A
{
    synchronized void method1( B b)
    {
        System.out.println("Class-A-> method1 called.");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        System.out.println("method-1 is calling last()");
        b.last();
    }
    
    synchronized void last()
    {
        System.out.println("Inside Object A last()");
    }
}

class B
{
    synchronized void method2( A a)
    {
        System.out.println("Class-B-> method2 called.");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        System.out.println("method-2 is calling last()");
        a.last();
    }
    
    synchronized void last()
    {
        System.out.println("Inside Object B last()");
    }
}