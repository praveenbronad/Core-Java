// WAJPto  calculate the sum of its divisors?
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class SumOfDivisors {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n= sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<=n;i++) // i<=n include number also
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		System.out.println("Sum "+ sum);
		

	}

}
