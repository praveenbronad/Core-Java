//WAJP TO PRINT FIZZ FOR EVEN NUMBER BUZZ FOR ODD NUMBERS?
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class BuzzPrinting {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n= sc.nextInt();
		sc.close();
		
		if(n%2==0)
		{
			System.out.println("FIZZ");
		}
		
		else
		{
			System.out.println("BUZZ");
		}

	}

}
