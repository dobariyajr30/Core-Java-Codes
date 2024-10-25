package jDemo9;

class thread extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running");
	}
}


public class p084_threads_01 
{	
	public static void main(String[] args)
	{
		thread t1=new thread();
		thread t2=new thread();
		thread t3=new thread();
		
		t1.start();
		t2.start();
		t3.start();		
	}
}
