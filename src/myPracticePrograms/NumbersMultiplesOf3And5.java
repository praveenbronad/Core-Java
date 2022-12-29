package myPracticePrograms;

import java.util.Scanner;

//Write a java program to print the numbers which are multiples of 3 and 5 between m and n?
public class NumbersMultiplesOf3And5 {

	public static void main(String[] args) {
		
		//import scanner class 
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the starting number ");
		
		int m = sc.nextInt();
		
		System.out.println("Enter the ending number ");
		
		int n= sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			if(i%5==0 && i%3==0)
			{
				System.out.println(i);
			}
		}

	}

}
