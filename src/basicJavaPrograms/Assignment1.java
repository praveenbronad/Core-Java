package basicJavaPrograms;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) 
	{
		
		// Write a java program to read subjects marks of 
		// calculate and print total percentage 
		
		// import scanner class
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter obtanied  marks of 4 subjects ");
		
		float kannada = sc.nextFloat();
		float English = sc.nextFloat();
		float Hindi = sc.nextFloat();
		float Maths = sc.nextFloat();
		
		sc.close();
		
		float totalMarks= kannada+English+Hindi+Maths;
		float percentage= totalMarks/400*100;
		
		System.out.println("your total marks = "+ totalMarks);
		System.out.println("Your Percentage is = "+ percentage);
		

	}

}
