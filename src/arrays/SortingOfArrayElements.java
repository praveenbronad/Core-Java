package arrays;

import java.util.Arrays;

public class SortingOfArrayElements {

	public static void main(String[] args) {
		int a[] = {34,56,78,932,87,4,67,70,6};
		Arrays.sort(a);
		//for(int i=0;i<a.length;i++)
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
