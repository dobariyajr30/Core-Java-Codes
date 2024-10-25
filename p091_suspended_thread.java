package jDemo_10;

class C extends Thread
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

public class p091_suspended_thread 
{
	public static void main(String[] args)
	{
		C t1=new C();
		C t2=new C();
		C t3=new C();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t2.suspend();
		t3.start();
		t2.resume();
	
	}
}
