//1. Write a java program to read a number(m) from the user, and print the natural numbers upto m.
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class NaturalNoUptoM {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		
		int m=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=m;i++)
		{
			System.out.println(i);
		}

	}

}
