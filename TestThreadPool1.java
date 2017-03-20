package Advance;
import java.util.*;
class ThreadPool2 implements Runnable
{
	String request;
	
	
	ThreadPool2(String s)
	{
		this.request = s;
		
	}
	public void run()
	{
		System.out.println("name of the user is" + " " + Thread.currentThread().getName() );
		sleep();
		System.out.println("Request of user " + " " + Thread.currentThread().getName() + " " + "is" + " " + request);
	}
	public void sleep()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		
	}
}	
	class ThreadPool3 implements Runnable
	{
	String request;
		
		
		ThreadPool3(String s)
		{
			this.request = s;
			
		}
		public void run()
		{
			System.out.println("name of the user is" + " " + Thread.currentThread().getName() );
			sleep();
			System.out.println("Request of user " + " " + Thread.currentThread().getName() + " " + "is" + " " + request);
		}
		public void sleep()
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			
		}
	
	
}
class TestThreadPool1
{
	public static void main(String[] args)
	{
	ThreadPool2 tp1 = new ThreadPool2("for providing services");
	Thread[] t = new Thread[5];
	for(int i=0; i<5 ; i++)
	{
		t[i] = new Thread(tp1);
		t[i].setPriority(Thread.MAX_PRIORITY);
		t[i].start();
	}
	
	
    ThreadPool3	tp2 = new ThreadPool3("help for finding location");
     Thread[] t1 = new Thread[5];
    for(int i=0; i<5 ; i++)
    {
	t[i] = new Thread(tp2);
	t[i].setPriority(Thread.MIN_PRIORITY);
	t[i].start();
}
    // here what i m doing? here i want to take 10 users in which 5 users request for providing services that have got maximum priority 
    //where as remaining 5 users request help for finding location that have got minimum priority

	

}
}