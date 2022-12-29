/*Read two integers from the user, display a menu where the user will have the following option
1. addition
2. subtraction
3. multiplication
4. Division
Users can select any one of the following tasks that task has to be done and the result must be displayed, if the user selects an invalid option display please enter valid input.

 */

package assignmentsProgrammingSessions;

import java.util.Scanner;

public class ReadingNumbers {

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		
		int b = sc.nextInt();
		
		
		System.out.println("what operations you want to do choose '+' , '-','/' and '*' ");
		
		
		char userOption= sc.next().charAt(0);
		sc.close();
		
		if(userOption=='+')
		{
			System.out.println("addition of two numbers is " + a+b);
		}
		
		else if(userOption=='-')
		{
			System.out.println("substarction of two numbers is " + (a-b));
		}
		else if(userOption=='/')
		{
			System.out.println("Division of two numbers is " + a/b);
		}
				
		else if(userOption=='*')
		{
			System.out.println("Multiplication of two numbers is " + (a*b));
		}
		
		else
		{
			System.out.println("please enter valid input! ");
		}

	}

}
