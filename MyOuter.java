import java.util.*;
public class MyOuter {
		private int x;
		class MyInner
		{
			void set()
			{
				x=43;
			}
			void get()
			{
				System.out.println(x);
			}
		}
		public static void main(String[] args)
		{
			MyOuter outerobj = new MyOuter();
			MyOuter.MyInner innerobj = outerobj.new MyInner();
			innerobj.set();
			innerobj.get();
		}
}
