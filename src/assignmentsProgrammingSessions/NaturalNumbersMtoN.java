//5.WAJP to print the numbers between m to n?
// ex.: start number m=10 end number n=20 , output = 11,12,13,14,15,16,17,18,19
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class NaturalNumbersMtoN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//import scanner class
		System.out.println("Enter Start Number");
		int m=sc.nextInt();//store value entered by user in variable 'm'
		System.out.println("Enter End Number");
		int n=sc.nextInt();////store value entered by user in variable 'n'
		sc.close();
		
		for( int i=m+1;i<n;i++)
			
		{
			System.out.println(i);
		}

	}

}
