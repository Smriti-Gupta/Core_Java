import java.util.*;
public class WrapperClass {
	public static void main(String []args)
	{
		Integer x = new Integer(5);
		Double d = new Double(1.5);
		Float f = new Float(1.82);
		int a = x.parseInt("18");
		double c = Math.sqrt(16);
		double e = d.parseDouble("2.5");
		double g = Math.abs(3.4);
		boolean h = f.equals(1.82);
		int i = x.compareTo(4);
		boolean j = d.equals(1.5);
		boolean k = x.equals(5);
		System.out.println("value of x is"+" "+x);
		System.out.println("value of d is"+" "+d);
		System.out.println("value of f is"+" "+f);
		System.out.println("value of a is"+" "+a);
		System.out.println("value of c is"+" "+c);
		System.out.println("value of e is"+" "+e);
		System.out.println("value of g is"+" "+g);
		System.out.println("value of h is"+" "+h);
		System.out.println("value of i is"+" "+i);
		System.out.println("value of j is"+" "+j);
		System.out.println("value of k is"+" "+k);
		
		
		
		
	}

}
