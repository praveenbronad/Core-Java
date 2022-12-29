
//WAJP TO READ 3 NUMBER FROM THE USER AND PRINT GREATEST OF A NUMBER?
package basicJavaPrograms;

import java.util.Scanner;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		//import Scanner Class
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number");
		float a= sc.nextFloat();
		float b= sc.nextFloat();
		float c= sc.nextFloat();
		sc.close();
		
		float temp=a>b? a:b;
		float largest=c>temp? c:temp;
		
		System.out.println("the largest of three numbers is = " + largest);
		
	}
}
