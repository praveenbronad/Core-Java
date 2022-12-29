
//WAJP to print the numbers from 1 to n?
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class NaturalNumbers1toN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}

	}

}
