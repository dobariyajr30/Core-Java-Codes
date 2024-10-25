package p101;

class usa extends Thread
{
	int s=0,i;
	public void run()
	{
		for(i=1; i<=5; i++)
		{
			System.out.println("Thread is running for Sum");
			s+=i;
		}
		System.out.println("Sum in USA "+s);
	}
}

class russia extends Thread
{
	int m=1,i;
	public void run()
	{
		for(i=1; i<=5; i++)
		{
			System.out.println("Thread is running for Multi");
			m*=i;
		}
		System.out.println("Multiplication is Russia "+m);
	}
}

public class p103_sum_thread 
{
	public static void main(String[] args) throws Exception
	{
		usa u1=new usa();
		russia r1=new russia();
		
		u1.start();
		r1.start();
		
		u1.join();
		r1.join();
		
		int total=u1.s+ r1.m;
		System.out.println("Total = " + total);

	}
}
