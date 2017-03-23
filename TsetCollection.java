package Advance;
import java.util.*;
class College 
{
	String name;
	int Position;
	
	College(String n, int p)
	{
		this.name = n;
		this.Position = p;
	}
	
}

public class TsetCollection 
{
	public static void main(String[] args)
	{
		College co1 = new College("BIT",5);
		College co2 = new College("Rungta",10);
		College co3 = new College("IITb",3);
		College co4 = new College("IITh",1);
		College co5 = new College("IITd",2);
		ArrayList<College> college =  new ArrayList<College>();
		college.add(co1);
		college.add(co2);
		college.add(co3);
		ArrayList<College> college1 =  new ArrayList<College>();
		college1.add(co4);
		college1.add(co5);
		college.addAll(college1);
		Iterator it = college.iterator();
		 while(it.hasNext()){
			 	System.out.println((College)it.next()); 
			    College ct=(College)it.next(); 
			   System.out.println(ct.name+" "+ct.Position);  
		}
		
	}
	
	

}
