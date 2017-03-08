import java.util.*;
public class Test {
	public static void main(String[] args)
	{
		TvRemote tv = new TvRemote();
		tv.button = 114;
		tv.channel();
	}
}
class TvRemote{
	int button;
	public void channel()
	{
		System.out.println("On pressing" + " " + button + " "+ "we will see the sony tv" );
	}
}