package jDemo_10;

class bank extends Thread
{
	int bal=5000;
	int withdraw;
	
	bank(int withdraw)
	{
		this.withdraw=withdraw;
	}
	public synchronized void run()
	{
		String name=Thread.currentThread().getName();
		
		if(withdraw<=bal)
		{
			System.out.println(name+"withdraw money");
			bal=bal-withdraw;
		}
		else
		{
			System.out.println("Insufficiant Balance");
		}
	}
}

public class p100_static_synchronization_thread
{
	public static void main(String[] args) 
	{
		bank obj=new bank(5000);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("Raju ");
		t2.setName("Sunita ");
		
		t1.start();
		t2.start();
	}
}
