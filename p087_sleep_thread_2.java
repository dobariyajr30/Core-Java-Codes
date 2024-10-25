package jDemo9;

class xy extends thread
{
	public void ab()
	{
		try
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println("Child Thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException i)
		{}
	}
}

public class p087_sleep_thread_2 
{
	public static void main(String[] args) throws InterruptedException
	{
		xy x1=new xy();
		
		x1.ab();
		
		for(int i=0; i<=5; i++)
		{
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
}
