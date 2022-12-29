//.WAJP to print positive or negative number?
package basicJavaPrograms;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args)
	{
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		if(n>0)
		{
			System.out.println("given number is positive number");
		}
		
		else if(n==0)
		{
			System.out.println("the entered number is neither positve not negitve its zero");
		}
		
		else
		{
			System.out.println("given number is negative ");
		}
	}

}
