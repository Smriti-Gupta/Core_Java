import java.util.*;
public class FiboTest {
	public static void main(String[] args)
	{
		Fibonacci f = new Fibonacci();
		System.out.println("Enter any number to print fiboncci series:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("firt" + " " + num1 + " " + "numbers of fibonacci series are:");
		f.fibo(num1);
		
	}

}
class Fibonacci{
	public void fibo(int num)
	{
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1 ; i<=num-2 ; i++)
		{
		c = a+b;
		a = b;
		b = c;
		System.out.println(c);
		}
		
	}
}

