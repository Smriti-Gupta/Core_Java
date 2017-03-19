
import java.util.*;
class JoinThread1 implements Runnable
{
	 public void run() 
	 {
	     int i =0;
		 	while( i< 20){
		 	  System.out.println("Executing = "+Thread.currentThread().getName());
		 	  i++;
	     }
	 }
	
	 
}

public class MultiThreadingExecution
{
	public static void main(String[] args)
	{
		JoinThread1 j = new JoinThread1();
		//JoinThread1 t2 = new JoinThread1();
		//JoinThread1 t3 = new JoinThread1();
		Thread t1 = new Thread(j);
		Thread t2 = new Thread(j);
		Thread t3 = new Thread(j);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		System.out.println("Executing" + " " + t1.getName());
		t3.start();
		System.out.println("Executing" + " " + t2.getName());
		t1.start();
		System.out.println("Executing" + " " + t3.getName());
		t2.start();
	
	
	}
}
