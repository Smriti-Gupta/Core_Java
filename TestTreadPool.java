package Advance;
import java.util.*;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class ThreadPool implements Runnable
{
	String request;
	
	
	ThreadPool(String s)
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
class ThreadPool1 implements Runnable
{
String request;
	
	
	ThreadPool1(String s)
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
public class TestTreadPool {
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(4);
		ThreadPool t = new ThreadPool("for providing services");
		for(int i=1 ; i<5 ; i++)
		{
		executor.execute( t );
		}
		//executor.execute( t );
		//executor.execute( t );
		
		ExecutorService executor1 = Executors.newFixedThreadPool(6);
		ThreadPool t1 = new ThreadPool("help for finding location");
		for(int i=1 ; i<7 ; i++)
		{
		executor.execute(t1);
		}
		
	}

}
