package jdemos;

import java.util.Scanner;

public class p044_Matrix {

	public static void main(String[] args) 
	{
		int i,j,or,mat1[][]=new int[10][10],mat2[][]=new int[10][10],mat3[][]=new int[10][10];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Order of Matrix-->");
		or=sc.nextInt();
		
		for(i=0; i<or; i++)
		{
			for(j=1; j<=or; j++)
			{
				System.out.print("Enter the Value for Matrix 1 element No "+i+j+"-->");
				mat1[i][j]=sc.nextInt();
			}
		}
		
		for(i=0; i<or; i++)
		{
			for(j=1; j<=or; j++)
			{
				System.out.print(" "+mat1[i][j]);
			}
			System.out.println("");		
		}
		
		
		for(i=0; i<or; i++)
		{
			for(j=0; i<or; j++)
			{
				System.out.println("Enter Value for 2 element No"+i+j+"-->");
				mat2[i][j]=sc.nextInt();
			}
			for(i=0; i<or; i++)
			{
				System.out.println(" "+mat2[i][j]);
			}
			System.out.println("");
		}
		
	}
}
