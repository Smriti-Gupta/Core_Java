import java.util.*;
class ExcepOverride{
	void override() throws ArithmeticException
	{
		System.out.println("superclass method");
	}
}
public class ExceptionOverride extends ExcepOverride {
		void override() throws Exception
		{
			System.out.println("subclass method");
		}
			
		public static void main(String[] args)
		{
			ExceptionOverride eo = new ExceptionOverride();
			try{
			
			eo.override();
			}
			catch(Exception ex)
			{
				System.out.println("Exception Handeled");
			}
			}
}
