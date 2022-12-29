//Write a java program to read 3 integers from the user and identify the largest number.
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 1st number ");
		int a= sc.nextInt();
		System.out.println("Enter a 2nd number ");
		int b= sc.nextInt();
		System.out.println("Enter a 3rd number ");
		int c= sc.nextInt();
		sc.close();
		
		if(a>b && a>c)
		{
			System.out.println(a + " is largest number");
		}
		
		else if(b>a && b>c)
		{
			System.out.println(b + " is largesst number");
		}
		
		else
		{
			System.out.println(c + " is the largest number");
		}
	}

}
