import java.util.*;
public class TestMultipleCatch {
	public void doMultiCatch()
	{
		try{
			String s = null;
			System.out.println(s.length());
		}
		finally
		{
			System.out.println("Always executed");
		}
		
	}
	public static void main(String[] agrs)
	{
		TestMultipleCatch tm = new TestMultipleCatch();
		try
		{
		tm.doMultiCatch();
	}
		
		catch(NullPointerException np)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception ex)
		{
			System.out.println("Exception");
			
		}

}
}