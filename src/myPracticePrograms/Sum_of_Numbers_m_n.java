package myPracticePrograms;
//Write a java program to read numbers(m and n) from the user, and obtain the sum of all the

import java.util.Scanner;

public class Sum_of_Numbers_m_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the starting number ");
		
		int m = sc.nextInt();
		
		System.out.println("Enter the ending number ");
		int sum =0;
		int n= sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of elements = " + sum);
	}

}
