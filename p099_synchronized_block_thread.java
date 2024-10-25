package jDemo_10;

class 
msg
{
	public synchronized void show(String name)
	{
		synchronized(this)
		{
			System.out.println("How are You..."+name);
		}
	}
}
class ourthread extends Thread
{
	msg m;
	String name;
	ourthread(msg m,String name)
	{
		this.m=m;
		this.name=name;
	}
	
	public void run()
	{
		m.show(name);
	}
}

public class p099_synchronized_block_thread
{
	
	public static void main(String[] args) 
	{
		msg m=new msg();
		
		ourthread t1=new ourthread(m,"Akhil");
		ourthread t2=new ourthread(m,"Nikhil");
		
		t1.start();
		t2.start();
	
	}

}
