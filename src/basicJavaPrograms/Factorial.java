//factorial ex: 3! = 3*2*1
// n!= n*(n-1)*(n-2)....*1
package basicJavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("facotial of a given number is " + fact);
		
	}

}
