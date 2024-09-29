package jDemo8;

class base
{
	public void sub(int a,int b)
	{
		System.out.println("in Base sub-->"+(a-b));
	}
}
class derived extends base
{
	public void add(int a,int b)
	{
		System.out.println("Sum-->"+(a+b));
	}
	
	public void sub(int a,int b)
	{
		System.out.println("Sub-->"+(a-b));
	}
}
public class p069_Dynamic_method_dispatch
{

	public static void main(String[] args) 
	{
		base bs=new base();
		derived dr=new derived();
		bs.sub(10,2);
		dr.sub(10,2);
		dr.add(10,2);
		bs=dr;
		bs.sub(10,2);
	}

}
