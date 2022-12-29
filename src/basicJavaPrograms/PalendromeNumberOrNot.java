//write a java program to identify the given number palendrome or not
package basicJavaPrograms;

import java.util.Scanner;

public class PalendromeNumberOrNot {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);// import scanner class and create scanner object
		
		System.out.println("Enter the Number");
		
		int n= sc.nextInt();
		int temp=n;
		sc.close();
		int res=0;
		while(n!=0)
		{
			int reminder=n%10;// gives reminder , last digit as an output
			res =res*10+ reminder;//
			n=n/10;// gives first digit as output 
		}
		
		if(temp==res)
		{
			System.out.println("Given Number is palendrome");
		}
		
		else
		{
			System.out.println("Given Number is not palendrome");
		}

	}

}
