package jDemo_10;

class I extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0; i<3; i++)
			{
				System.out.println("Thread is Running");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException i)
		{
			System.out.println("Thread has been termineted");
		}
	}
}

public class p095_interrupt_thread 
{
	public static void main(String[] args)
	{
		I t1=new I();
		
		t1.start();
		t1.interrupt();
	}

}
