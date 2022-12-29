package myPracticePrograms;

import java.util.Scanner;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int n= sc.nextInt();
	sc.close();
	while(n!=0)
	{
		int r = n%10;
		System.out.print(r);
		n=n/10;
	}
	
	}

}
