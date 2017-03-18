import java.util.*;
interface Showing
{
	String show();
}
public class AnonymousInner {
	public void display(Showing s)
	{
		System.out.print(s.show());
	}
	
	public static void main(String[] args)
	{
		AnonymousInner ti = new AnonymousInner();
		ti.display(new Showing(){
			public String show()
			{
				return "showing msg";
			}
		});
	}

}
