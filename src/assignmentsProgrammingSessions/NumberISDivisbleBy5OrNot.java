package assignmentsProgrammingSessions;

import java.util.Scanner;

public class NumberISDivisbleBy5OrNot {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		if(n%5==0)
		{
			System.out.println("Number is Divisble by 5 ");
		}
		
		else
		{
			System.out.println("Number is not Divisible by 5 " );
		}
		

	}

}
