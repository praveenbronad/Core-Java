//Write a java program to find whether the given year is a leap year or not.
// if year (100%==0 and 400%==0)--> leap year
// if (100%!=0 and 4%==0)--> leap year
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("ENter year");
		int year = sc.nextInt();
		
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println("its leap year ");
		}
		
		else
		{
			System.out.println("its not leap year");
		}

	}

}
