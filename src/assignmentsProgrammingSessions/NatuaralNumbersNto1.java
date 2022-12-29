//WAJP to print the numbers from n to 1?
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class NatuaralNumbersNto1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
