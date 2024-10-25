package jDemo_10;

class B extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		for(int i=0; i<3; i++)
		{
			System.out.println(name);
		}
	}
}

public class p090_join_thread
{
	public static void main(String[] args)
	{
		B t1=new B();
		B t2=new B();
		B t3=new B(); 
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		
		t2.start();
		try
		{
			t2.join();
		}
		catch(InterruptedException i)
		{}
		t1.start();
		t3.start();
		
		String name=Thread.currentThread().getName();
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Main");
		}
		
	
	}
}
