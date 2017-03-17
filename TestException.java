import java.util.*;
public class TestException {
	public void doException() throws NumberFormatException
	{
		try 
		{
			System.out.println("throws an NumberFormatException");
			throw new NumberFormatException();
		}
	
		finally
		{
			System.out.println("This block always runs rather an exception is thrown or not that does'nt matter");
			
		}
	}		
		public static void main(String[] args){
			TestException te = new TestException();
			// now calling doException method that throws an Exception...
			try
			{
				te.doException();
				}
			catch(NumberFormatException nfe)
			{
				System.out.println("nfe is successfully recovered");
			}
			System.out.println("so we can handled an exception by maintaing the flow of the program that throws an exception");
			
		}
	

}
