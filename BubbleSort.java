import java.util.*;
public class BubbleSort {
	public static void main(String[] args){
		TestBubble t = new TestBubble();
		int[] arr1 = {18 ,20,19,15,30};
		System.out.println("Elements of array before sorting:");
		for(int i=0 ; i<arr1.length ;i++){
			System.out.println(arr1[i]);
		}
		t.bubble(arr1);
		System.out.println("Elements of array after sorting:");
		for(int j=0; j<arr1.length ; j++)
		{
			System.out.println(arr1[j]);
		}
		
	}

}
class TestBubble{
		public void bubble(int[] arr)
		{
			
			int n = arr.length;
			int temp;
			for(int i=1; i<n ;i++)
			{
			for(int j=0 ; j<(n-i) ;j++)
			{
				if(arr[j] > arr[j+1])
				{
					 temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			}
			 
		}
}