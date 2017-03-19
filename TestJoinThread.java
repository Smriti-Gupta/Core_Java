package Advance;
import java.util.*;
 class JoinThread extends Thread
{
	public void run()
	{
		for(int i=0 ; i<6 ; i++)
		{
			int n=10;
			try
			{
				Thread.sleep(1500);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
			n = n*i;
			System.out.println(n);
		}
	}
}
public class TestJoinThread {
	public static void main(String[] args)
	{
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();
		JoinThread t3 = new JoinThread();
		t1.setName("Thread 1");
		System.out.println("Executing" + " " + t1.getName());
		t1.start();
		//t2.start();
		try
		{
			t1.join(1000);
		}
		catch(InterruptedException ex1)
		{
			System.out.println(ex1);
		}
		t2.setName("Thread 2");
		System.out.println("Executing" + " " + t2.getName());
		t3.setName("Thread 3");
		System.out.println("Executing" + " " + t3.getName());
	//	t2.start(); a tread will start only once we can't start thread  again...... here we can start again t2 thats not possible
		t2.start();
		t3.start();
	}

}
