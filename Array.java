import java.util.*;
public class Array {
	public static void main(String []args)
	{
		// printing the elements of an array.....
		
		int[] arr1 = {32,33,34,35,36};
		System.out.println("The elements of an Arrays are:");
		for(int i=0 ; i<arr1.length ; i++ )
		{
			System.out.println(arr1[i]);
		}
		
		// printing index of a character of a string & also printing the elements of a string array......
		
		String[] arr2 = {"Test" , "Marks" , "Exams" , "Sessional"};
		System.out.println("The elements of the string arrays are:");
		for(int j=0 ; j<arr2.length ; j++)
		{
				if(arr2[j] == "Marks")
				{
					String s = new String("Marks");
					int i = s.indexOf('k');
					System.out.println("Index Of character \'k\' :" + " " + i );
					continue;
				}
				
				System.out.println(arr2[j]);
		}
		

}
}