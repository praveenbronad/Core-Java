package basicJavaPrograms;

import java.util.Scanner;

public class Special2DigitNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 2 digit number ");
		int n= sc.nextInt();
		sc.close();
		
		int number1=n%10;
		int number2=n/10;
		
		int sum=(number1+number2)+(number1*number2);
		
		if(n==sum)
			
		{
			System.out.println("Entered 2 digit Number is Special Digit");
		}
		
		else
		{
			System.out.println("Entered 2 digit number is not a special digit ");
		}

	}

}
