import java.util.*;
public class TestException2 {
	public void doException()
	{
		try
		{
			String s = "abc";
			int n = Integer.parseInt(s);
		}
		finally
		{
			System.out.println("We want to convert a String into an Integer");
			
		}
	}		
		public void arrPrint() 
		{
		try{	
		int[] arr = new int[5];
		arr[0]= 1;
		arr[1]= 2;
		arr[3]= 3;
		arr[4]= 4;
		arr[5]= 5;
		for(int x=0 ; x < 5 ; x++)
		{
			System.out.println(arr[x]);
		}
		}
		finally{
			System.out.println("ArrayOutOfBoundsEcxeption must be thrown");
		}
	}
	
	public static void main(String[] args)
	{
		TestException2 te = new TestException2();
		try
		{
		te.doException();// here we get an exception...
		System.out.println("rest of the code");// so that rest of the code will be not executed after getting an exception...
		}
		catch(Exception ex)
		{
			System.out.println("successfully caughted the Exception");
		}
		try{
		te.arrPrint();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("ArrayIndexOutOfBoundsException caughted");
		}
}
}
