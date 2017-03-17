import java.util.*;
 interface Print
{
	void show();
	interface Show
	{
		void print();
	}
}
 class TestInner implements Print.Show
{
	public void print()
	{
		System.out.println("printing msg");
	}
	
 public	void show()
	{
		System.out.println("showing msg");
	}
	
	public static void main(String[] args)
	{	
		TestInner obj1 = new TestInner();
		Print.Show obj = new TestInner();
		obj.print();
		obj1.show();
		obj1.show();
		
	}
				
}
