package jDemo9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class std
{
	int rollno,sci,guj,maths;
	String sname;
	
	std(int rno ,String xsname, int xeng,int xsci, int xmaths)
	{
		rollno=rno;
		sci=xsci;
		maths=xmaths;
		sname=xsname;
	}
	public void s_info() 
	{
        System.out.println("Roll No: "+rollno+", Name: "+sname+", Maths: "+maths+", Gujarati: "+guj+",Sci: "+sci);
    }

    public void s_total1() 
    {
        int total=maths+guj+sci;
        System.out.println("Roll No: " + rollno + ", Name: " + sname + ", Total Marks: " + total);
    }

    public void s_grade1()
    {
        int total=guj+maths+sci;
        String grade=(total >= 90) ? "Pass" : "Fail";
        System.out.println("Roll No: "+ rollno+", Name: "+sname+", Grade: "+grade);
    }
	public String getname()
	{
		return sname;		
	}
	public void setname(String x) 
	{
	    sname=x;
	}
	public int getroll()
	{
		return rollno;
	}
	public int gettotal()
	{
		return guj+maths+sci;
	}
	public void setmaths(int set_maths)
	{
		maths=set_maths;
	}
	public void setguj(int set_guj)
	{
		guj=set_guj;
	}
	public void setsci(int set_sci)
	{
		sci=set_sci;
	}
	
};

public class p082_ArrayList_1 
{

	public static void main(String[] args)
	{	
	
		int s_roll[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int sci_marks[] = {34, 14, 26, 58, 34, 44, 39, 45, 28, 50, 49, 37, 22, 54, 40};
		int guj_marks[] = {56, 20, 34, 56, 35, 60, 48, 38, 25, 42, 50, 33, 45, 37, 55};
		int maths_marks[] = {56, 34, 64, 53, 64, 48, 52, 43, 61, 50, 45, 39, 67, 48, 53};
		String s_name[] = {"Rohan", "Madhav", "Ram", "Bharat", "Sita", "Krishna", "Arjun", "Shyam", "Mohan", "Geeta", "Radha", "Suraj", "Laxmi", "Manoj", "Meera"};
		int i;
		
		 // Colors
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String CYAN = "\u001B[36m";
        String BRIGHT_RED = "\u001B[91m";
        String BRIGHT_GREEN = "\u001B[92m";
		
		ArrayList<std> a1=new ArrayList();
		int opt;
		
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<15;i++)
		{
			std s=new std(s_roll[i],s_name[i],guj_marks[i],maths_marks[i],sci_marks[i]);
			a1.add(s);
		}
		
		
		while(true)
		{
			System.out.println(CYAN);
			System.out.println("Press 1 for Student Information");
			System.out.println("Press 2 for Subject marks and total");
			System.out.println("Press 3 for Know who are 'pass' or 'fail' in Exam");
			System.out.println("Press 4 for Delete Student record using Roll Number");
			System.out.println("Press 5 for Delte Fail Student Record");
			System.out.println("Press 6 for Delte Pass Student Record");
			System.out.println("Press 7 Update Student Marks");
			System.out.println("Press 8 Update Student Name");
			opt=sc.nextInt();
			System.out.println(RESET);
			if(opt==1)
			{
				Iterator<std> itr = a1.iterator();
				
				while(itr.hasNext()) 
				{
					std s1=(std)itr.next();
					System.out.println(GREEN);
					s1.s_info();
					System.out.println(RESET+"\n");
			    }
			}
			else if(opt==2)
			{
				Iterator<std> itr=a1.iterator();
				
				while(itr.hasNext())
				{
					std s1=(std)itr.next();
					System.out.println(BLUE);
					s1.s_total1();
					System.out.println(RESET+"\n");
				} 
			}
			else if(opt==3)
			{
				Iterator<std> itr=a1.iterator();
					
				while(itr.hasNext())
				{
					std s1=(std)itr.next();
					System.out.println(YELLOW);
					s1.s_grade1();
					System.out.println(RESET+"\n");
				}
			}
			else if(opt==4)
			{
				int ser_roll,c=0;
				
				System.out.println("Enter Roll Number of Student to remove His/Her Data");
				ser_roll=sc.nextInt();
				
				for(std s1:a1)
				{
					if(s1.getroll()==ser_roll)
					{
					 a1.remove(s1);
					 c++;
					 System.out.println(RED+"Remove_Succesfully"+RESET);
					 break;
					}
				}
				if(c==0)
				{
					System.out.println(RED+"There is No Such Roll Number exist \n"+RESET);
				}
			}
			else if(opt==5) 
			{
                Iterator<std> itr=a1.iterator();

                while(itr.hasNext())
                {
                    std s1=(std) itr.next();
                    if (s1.gettotal()<90)
                    {
                        itr.remove();
                    } 
                    else 
                    {
                        s1.s_grade1();
                        System.out.println(RESET+"");
                    }
                }
                System.out.println(GREEN+"Fail student records removed."+RESET);
            }
			else if(opt==6)
			{
				Iterator<std> itr=a1.iterator();
				
				while(itr.hasNext())
				{
					std s1=(std)itr.next();
					if(s1.gettotal()>90)
					{
						itr.remove();
					}
					else
					{
						s1.s_grade1();
						System.out.println(RESET+"");
					}
				}
				System.out.println(RED + "Pass student records removed." + RESET);
			}
			else if(opt==7)
			{
					int ser_roll;
					
					System.out.println(BRIGHT_GREEN+"Enter Roll Number where you have to change marks-->"+RESET);
					ser_roll=sc.nextInt();
	
					int opt_sub;
						
					System.out.println(CYAN+"Press 1 for update Marks in Maths");
					System.out.println("Press 2 for update Marks in Gujarati");
					System.out.println("Press 3 for update Marks in Scince"+RESET);
						
					System.out.println("Of Which Subject You want to change Marks;");
					opt_sub=sc.nextInt();	
					
						if(opt_sub==1)
						{
							int up_marks;
							
							System.out.println(BLUE+"Enter Marks You want to update-->"+RESET);
							up_marks=sc.nextInt();
								
							for(std s1:a1)
							{
								if(s1.getroll()==ser_roll)
								{
								 s1.setmaths(up_marks);
								 System.out.println(GREEN+"Marks_Updated"+RESET);
								 break;
								}
								else
								{
									System.out.println(RED+"Invalid Roll Number"+RESET);
								}
							}
						}
						else if(opt_sub==2)
						{
						  int up_marks;
								
					      System.out.println(BLUE+"Enter Marks You want to update-->"+RESET);
						  up_marks=sc.nextInt();
								
					      for(std s1:a1)
							{
								if(s1.getroll()==ser_roll)
								{
									s1.setguj(up_marks);	
									System.out.println(GREEN+"Marks_Updated"+RESET);
									break;
								}
								else
								{
									System.out.println(RED+"Invalid Roll_Number"+RESET);
									
								}
							}	
						}
						else if(opt_sub==3)
						{
							int up_marks;
							
						      System.out.println(BLUE+"Enter Marks You want to update-->"+RESET);
							  up_marks=sc.nextInt();
									
						      for(std s1:a1)
								{
									if(s1.getroll()==ser_roll)
									{
										s1.setsci(up_marks);	
										System.out.println(GREEN+"Marks_Updated"+RESET);
										break;
									}
									else
									{
										System.out.println(RED+"Invalid Roll Number"+RESET);
									}
								}	
						}
						else 
						{
						 System.out.println(RED+"Invalid Option"+RESET);
						}					
				}
			else if(opt==8)
			{
				String up_name;
				int ser_roll;
				
				
				System.out.println(BRIGHT_GREEN+"Enter Student Roll Number for changing-->"+RESET);
				ser_roll=sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter Updated Name-->");
				up_name=sc.nextLine();
				
				for(std s1:a1)
				{
					if(s1.getroll()==ser_roll)
					{
						s1.setname(up_name);
						System.out.println(GREEN+"Name_Updated"+RESET);
						break;
					}
				}
			}
			
			else
			{
				System.out.println(RED+"\nInvalid Option \n"+RESET);
			}	
		  }
		}
}
