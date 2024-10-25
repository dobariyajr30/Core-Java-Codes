package jDemo_10;

class A implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class p088_Runnable_thread 
{
	public static void main(String[] args) 
	{
		A t1=new A();
		 
		Thread t=new Thread(t1);
		t.start();
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
