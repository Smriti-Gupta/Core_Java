package Advance;
import java.util.*;
class MyRunnable1 extends Thread//this class implements the runnable interface to defining run() where put the job that thread(worker) runs....
{
	public void run()//used method propagation
	{
		set();
	}
	public void set()
	{
		get();
	}
	public void get()
	{
		for(int i=1 ; i<5 ; i++)
		{
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			System.out.println("this is my thread");
			System.out.println(i);
	}
}
}
public class MyThread1 {
	public static void main(String[] args)
	{
		MyRunnable1 m1 = new MyRunnable1();
		m1.run();
		MyRunnable1 m2 = new MyRunnable1();
		m2.run();
		}
}