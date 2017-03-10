import java.util.*;
public class Abstraction {
	public static void main(String[] args)
	{
		Person[] p = new Person[2];
		 p[0] =new Person();
		 p[1]= new Person();
		System.out.println(" Enter the persons informations:");
		Scanner s1 = new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		String[] count = new String[2];
		count[0] = "first";
		count[1] = "second";
		for(int x=0; x<2 ; x++)
		 {		
			System.out.println(" Enter name of" + " " + count[x] + " " + "person:" );
			  String name1 = s2.next();
			  System.out.println(" Enter mob no. of" + " " + count[x] + " " + "person:" );
			 long mob1 = s1.nextLong();
			  p[x].setInfo(mob1,name1);
			p[x].getInfo();
		 }
		  
}
}
class Person{
    private	long mob ;
	private String name;
	public void setInfo(long m,String n){
		mob = m;
		name = n;
	}
	public void getInfo(){
		System.out.println("mob no. =" + " "+ mob );
		System.out.println(" name =" + " "+ name );
		
		}
	}
		

