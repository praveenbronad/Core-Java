package arrays;

import java.util.Scanner;

public class ReverseElementsOfAnArray {

	public static void main(String[] args) {
		
		// Import scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		
		int n= sc.nextInt();
		int a[]= new int [n];
		for(int i =0; i<n;i++)
		{
			System.out.println("Enter the " + (i+1) + "Element");
			
			a[i]= sc.nextInt();
		}
		System.out.println("Orginal Elements of an array ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("Reversed elements of an array");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
