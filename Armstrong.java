import java.util.*;
public class Armstrong {
	public static void main(String[] agrs){
		TestArm t = new TestArm();
		System.out.println("Enter any number to check whether the number is Armstrong or not:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		t.arm(number);
		}
	

}
class TestArm{
	int num;
	public void arm(int n)
	{
		int temp = n;
		int sum=0;
		int r,r1;
		while(n!=0)
		{
			r = n%10;
			r1 = r*r*r;
			sum = sum + r1;
			n = n/10;
			}
		if(temp == sum)
		{
			System.out.println("The number is Armstrong number");
		}
		else
		{
			System.out.println("The number is not Armstrong number");	
		}
	}
}
