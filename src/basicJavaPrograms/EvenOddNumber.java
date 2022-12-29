//odd even number program
package basicJavaPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args)
	{
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		if(n%2==0)
		{
			System.out.println("its even number ");
		}
		
		else
		{
			System.out.println("its odd number");
		}

	}

}
