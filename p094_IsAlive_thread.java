package jDemo_10;

class G extends Thread
{
	public void run()
	{
		System.out.println("isAlive method program..!");
	}
}

public class p094_IsAlive_thread 
{
	public static void main(String[] args)
	{
		G t1=new G();
		G t2=new G();
		G t3=new G();
		
		System.out.println(t1.isAlive());
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		t3.start();
	}

}
