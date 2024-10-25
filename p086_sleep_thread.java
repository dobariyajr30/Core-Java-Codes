package jDemo9;

class ab extends thread
{
	
	public void run()
	{
		try
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println("Thread in class");
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException i)
		{
			
		}	
	}
}

public class p086_sleep_thread 
{
	public static void main(String[] args) throws InterruptedException
	{
		ab a1=new ab();
		
		a1.start();
		
		for(int i=0; i<=5; i++)
		{
			System.out.println("Thread in main");
			Thread.sleep(3000);
		}

	}

}
