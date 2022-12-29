package arrays;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		
		int a[]= {67,89,90,56,678,69,8,86};
		
		int largestElement= a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largestElement)
			{
				largestElement=a[i];
			}
			
			
		}
		System.out.println("largest element in an array is = " + largestElement);
	}

}
