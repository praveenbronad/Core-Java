
package myPracticePrograms;

import java.util.Scanner;

/*
 * what is palendrome number ?
 * A palindromic number is a number that remains the same when its digits are reversed.
 */
public class PalenddromeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		sc.close();
		System.out.println("the entred number is = " + n );
		int temp=n;
		int res=0;
		
		while(n!=0)
		{
			int r = n%10;
			res=res*10+r;// main logic
			n=n/10;
		}
		
		System.out.println("the reversed number is = " + res);
		
		if( temp==res)
		{
			System.out.println("the given number is palendrome");
		}
		
		else
		{
			System.out.println("the given number is not palendrome");
		}

	}

}
