package arrays;

import java.util.Scanner;

public class SumOfAnArrayElementsInputFromUser {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of an array");
		
		int size=sc.nextInt();
		
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter ELement at index " + i);
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<size;j++)
		{
			sum+=a[j];
		}
		
		System.out.println("Sum of an array elements is = " + sum);

	}

}
