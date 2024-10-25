package p101;

public class p101_Priority_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1=new Thread();
		Thread th2=new Thread();
		Thread th3=new Thread();
		Thread th4=new Thread();
		Thread th5=new Thread();
		
		
		System.out.println(th1);
		System.out.println(th2);
		System.out.println(th3);
		System.out.println(th4);
		System.out.println(th5);
		
		
		th1.setName("dell");
		th1.setPriority(10);
		
		System.out.println(th1);
		System.out.println(th2);
		System.out.println(th3);
		System.out.println(th4);
		System.out.println(th5);
		

	}

}
