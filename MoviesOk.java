import java.util.*;
class TvChannels
{	
	
	public void watching(String s)
	{
		System.out.println("watching" + " " + s);
	}
	public void watching(int num)//overloading
	{
		System.out.println("watching UTv movies at" + " " + num );
	}
}
class Sports extends TvChannels
{
	
	public void watching(String s)// overriding
	{
		System.out.println("watching " + " " + s);
	}
	public void watching(int num)//overriding
	{
		System.out.println("watching Sports at" + " " + num );
	}
	public void display()
	{
		super.watching("UTvMovies");
		super.watching(442);
		watching("Sports");
		watching(321);
	}
}

public class MoviesOk {
	public static void main(String[] args)
	{
		Sports sp = new Sports();
		sp.display();
	}

}
