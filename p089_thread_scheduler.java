package jDemo_10;

class schedul extends Thread
{
	public void run()
	{
		String n=Thread.currentThread().getName();
		
		for(int i=0; i<=3; i++)
		{
			System.out.println(n);
		}
	}
}

public class p089_thread_scheduler 
{
	public static void main(String[] args) 
	{
		schedul s1=new schedul();
		schedul s2=new schedul();
		schedul s3=new schedul();
		
		s1.setName("Thread 1");
		s2.setName("Thread 2");
		s3.setName("Thread 3");
		
		s1.start();
		s2.start();
		s3.start();
		
		String n=Thread.currentThread().getName();
		for(int i=0; i<=3; i++)
		{
			System.out.println(n);
		}
	}
}
