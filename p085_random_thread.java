package jDemo9;

class multithread extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class p085_random_thread
{
	public static void main(String[] args) 
	{
		multithread m1=new multithread();
		
		m1.start();
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Parent Thread");
		}
	}

}
