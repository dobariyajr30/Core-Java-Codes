package jdemos;

import java.util.Scanner;

public class p010_Percentage_of_Marks {

	public static void main(String[] args) 
	{
		int maths,sci,guj,eng;
		double total,per;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Maths Marks-->");
		maths=sc.nextInt();
		
		System.out.println("Enter Your English Marks-->");
		eng=sc.nextInt();
		
		System.out.println("Enter Your Gujarati Marks-->");
		guj=sc.nextInt();
		
		System.out.println("Enter Your Science Marks-->");
		sci=sc.nextInt();
		
		total=maths+eng+guj+sci;
		
		System.out.println("Your total is "+ total);
		
		per=(total*100)/240;
		
		System.out.println("Your Percantage is "+ per);
	

	}

}
