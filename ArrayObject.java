import java.util.*;
public class ArrayObject {
	public static void main(String[] args)
	{
		Book[] b = new Book[3];
		int x=0;
		while(x<3)
		{
			b[x] = new Book();
			x++;
		}
		b[0].title = "java Threading";
		b[0].author = "Dennis Rechie";
		b[0].reading();
		b[1].title = "java Inheritence";
		b[1].author = "Dennis Rechie";
		b[1].reading();
		b[2].title = "java synchronization";
		b[2].author = "Dennis Rechie";
		b[2].reading();
	 }

}
class Book{
	String title;
	String author;
	public void reading()
	{
		System.out.println("reading"+ " " + title + " "+ "written by" + " "+ author);
	}
}