package jDemo_10;

class Bus implements Runnable  
{
	int avbl=2,pass;
	
	Bus(int pass)
	{
		this.pass=pass;
	}
	
	public synchronized void run()
	{
		String name=Thread.currentThread().getName();
		if(avbl>=pass)
		{
			System.out.println(name+" Reserved Seat");
			avbl=avbl-pass;
		}
		else
		{
			System.out.println("Seat not available..!");
		}
	}
}

public class p097_synchronization_thread 
{
	public static void main(String[] args)
	{
		Bus r=new Bus(1);
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		
		t1.setName("Raj");
		t2.setName("Simran");
		t3.setName("Chaudhry");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
