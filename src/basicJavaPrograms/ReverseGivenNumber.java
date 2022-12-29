// write a java program to reverse a given number
package basicJavaPrograms;

import java.util.Scanner;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);// import scanner class and create scanner object
		
		System.out.println("Enter the Number");
		
		int n= sc.nextInt();
		sc.close();
		
		while(n>0)
		{
			int reminder=n%10;// gives reminder , last digit 
			System.out.print(reminder);
			n=n/10;// gives first digit as output 
		}

	}

}
