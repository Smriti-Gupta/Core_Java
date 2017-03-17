
import java.util.*;
class ExcepOverride3{
	
	void ovrride() throws ArithmeticException
	{
		System.out.println("superclass method");
	}
}
public class ExceptionOverride3 extends  ExcepOverride3 {
	
		void override() 
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
					System.out.println("Exception Handeled");// that block will not executed...
				}
		}
	

}
