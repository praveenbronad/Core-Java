// Write a java program to find given number is abdunt number or not
/*
 * In number theory, an abundant number or excessive number is a number 
 * for which the sum of its proper divisors is greater than the number. 
 * The integer 12 is the first abundant number.
 * 12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100.
 */
package basicJavaPrograms;

import java.util.Scanner;

public class AbduntNumbers {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		
		for(int i=1;i<n;i++)// exclude the number if n=15 , dont include 15 
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum>n)
		{
			System.out.println("Given number is abdunt number");
		}
		
		else
		{
			System.out.println("Given Number is not an abdunt number");
		}
	
	}

}
