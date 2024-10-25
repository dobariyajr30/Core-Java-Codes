package p101;

class a extends Thread
{

	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("A Thread "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}

class b extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("B Thread "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class p102_class_thread
{
	public static void main(String[] args)
	{
		a a1=new a();
		b b1=new b();
		a1.start();
		b1.start();
	}

}
