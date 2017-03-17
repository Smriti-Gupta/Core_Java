import java.util.*;
public class ExceptionTest {
	public void doException()
	{
		throw new Error();
	}
	public static void main(String[] agrs)
	{
		ExceptionTest et = new ExceptionTest ();
		try
		{
			et.doException();
		}
		catch(RuntimeException ex)
		{
			System.out.println("RuntimeException");
		}
		catch(Exception ex1)
		{
			System.out.println("Exceotion");
		}
		catch(Error e)
		{
			System.out.println("ErrorException");
		}
	
	}

}
