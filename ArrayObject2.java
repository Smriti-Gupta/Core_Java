import java.util.*;
public class ArrayObject2 {
	public static void main(String[] args)
	{
		Books[] b = new Books[3];
		int x=0;
		while(x<3)
		{
			b[x] = new Books();
			x++;
		}
	
	Scanner[] sc1 = new Scanner[3];
	Scanner[] sc2 = new Scanner[3];
	for(int z=0 ; z<3 ; z++)
	{
		sc1[z] = new Scanner(System.in);
		sc2[z] = new Scanner(System.in);
		
	}
	String[] count = new String[3];
	count[0] = "First";
	count[1] = "Second";
	count[2] = "Third";
	for(int y=0 ; y<3 ; y++)
	{
		System.out.println("Enter the \'Title\' & \'Author\' of " + " " + count[y] + " "+ "Book: ");
		String s1 = sc1[y].next();
		String s2 = sc2[y].next();
		System.out.println("The Title of " + " " + count[y] + " " + "Book is:");
		System.out.println(s1);
		System.out.println("The Author of " + " " + count[y] + " " + "Book is:");
		System.out.println(s2);
	}
	
}
}
class Books{
	String title;
	String author;
	public void reading()
	{
		System.out.println("reading"+ " " + title + " "+ "written by" + " "+ author);
	}
}
