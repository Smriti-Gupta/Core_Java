import java.util.*;
import java.io.*;
class ExcepOverride1{
	void ovrride()//if superclass method does not declare an Exception so in that case subclass method must be declared checked exception not unchecked Exception... 
	{
		System.out.println("superclass method");
	}
}
public class ExceptionOverride2 extends  ExcepOverride1
{
	void override() throws IOException// here subclass method declared as checked exception....
	{
		System.out.println("subclass");
	}
	
	public static void main(String[] args)
	{
		ExceptionOverride2 eo = new ExceptionOverride2();
		try{
			
			eo.override();
			}
			catch(Exception ex)
			{
				System.out.println("Exception Handeled");
			}
	}
}
