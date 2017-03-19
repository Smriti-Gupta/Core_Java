package Advance;
import java.util.*;
class MyRunnable implements Runnable//this class implements the runnable interface to defining run() where put the job that thread(worker) runs....
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
 class Mythread {
	public static void main(String[] args)
	{
		MyRunnable m = new MyRunnable();//make new Runnable object for accessing the run() method
		Thread t = new Thread(m);//make new worker and give it job to run something....
		t.start();//starts the new thread
		//don't need to invoke run method bcoz this is automatically invoked as soon as thread is started.......
		Thread t1 = new Thread(m);
		t1.start();
	}

}
