package basicJavaPrograms;

import java.util.Scanner;

public class ZeroOrNonZeroNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		if(n==0)
		{
			System.out.println("given number is Zero number");
		}
		
		else
		{
			System.out.println("its non zero number");
		}
		

	}

}
