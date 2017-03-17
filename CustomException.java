import java.util.*;
 class InvalidMarksException extends Exception
{
	InvalidMarksException(String s)
	{
		super(s);
	}
}
public class CustomException 
{
			
	static void invalidMarks(int marks) throws InvalidMarksException
	{
		if(marks < 33)
		{
			throw new InvalidMarksException("Marks is Invalid");
			//System.out.println("Invalid Marks"); unreachable code after getting Exception...
		}
		else
		{
			System.out.println("marks is valid");
		}
		
	}
	public static void main(String[] args)
	{
		CustomException ce = new CustomException();
		try {
			ce.invalidMarks(31);
		}
		catch(InvalidMarksException ime)
		{
			System.out.println(ime);
		}
	}
	
}
