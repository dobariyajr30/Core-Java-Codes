package jDemo_10;

class J extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}


public class p096_setPriority_thread 
{
	public static void main(String[] args) 
	{
		J t1=new J();
		J t2=new J();
		J t3=new J();
		
		t1.setName("Thread 1 is Running");
		t2.setName("Thread 2 is Running");
		t3.setName("Thread 3 is Running");
		
		t1.setPriority(6);
		t2.setPriority(3);
		t3.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
