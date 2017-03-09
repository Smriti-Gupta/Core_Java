import java.util.*;
public class Factorial {
	public static void main(String[] args)
	{
		FactDefine f = new FactDefine();
		System.out.println("Enter any number to find out factorial:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		f.getFact(num1);
		
	}

}

class FactDefine{

	public void getFact(int num)
	{
		int fact = 1;
		for(int i= num ; i>0 ; i--)
		{
			fact = fact * i;
			
			}
		System.out.println("factorial of" + " " + num + " " + "is" + " " + fact);
		
	}
}
	
	

