import java.util.*;
public class Palindrome {
	public static void main(String[] args)
	{
		TestPelin t = new TestPelin();
		System.out.print("Enter any number to check whether the number is palindrome or not");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		t.Pd(number);
		
	}

}
class TestPelin
{
		int num;
	public void Pd(int n)
	{	
		int temp = n;
		int r;
		int sum =0;
			while(n!=0)
			{
				r = n%10;
				sum = (sum*10)+ r;
				n = n/10;
				
			}
			if(temp == sum)
			{
				System.out.println("Number is palindrome");
				
			}
			else
			{
				System.out.println("Number is not palindrome");
			}
		
	}
		
		
	}

