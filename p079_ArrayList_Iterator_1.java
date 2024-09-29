package jDemo8;

import java.util.ArrayList;
import java.util.Iterator;

public class p079_ArrayList_Iterator_1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList();
		
		a1.add(23);
		a1.add(43);
		a1.add(56);
		a1.add(87);
		a1.add(23);
		a1.add(98);
		
		Iterator<Integer> itr = a1.iterator();
		
		while(itr.hasNext()) 
		{
	       System.out.println(itr.next());
	    }
		
	}
}
