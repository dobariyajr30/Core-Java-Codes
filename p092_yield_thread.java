package jDemo_10;

class D extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		for(int i=0; i<3; i++)
		{
			System.out.println(name);
			Thread.yield();
		}
	}
}
class E extends Thread
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
public class p092_yield_thread
{
	public static void main(String[] args) 
	{
		D t1=new D();
		E t2=new E();
	
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
	}
}
