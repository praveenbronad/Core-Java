package arrays;

public class SmallestElementOfAnArray {

public static void main(String[] args) {
int a[]= {67,89,90,56,678,69,8,86};
		
		int smallestElement= a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallestElement)
			{
				smallestElement=a[i];
			}
			
			
		}
		System.out.println("smallest element in an array is = " + smallestElement);

	}

}
