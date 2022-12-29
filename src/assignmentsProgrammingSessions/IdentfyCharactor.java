//.Write a java program to read a character from the user, check whether the character is an Alphabet, or a number, or a special character.
package assignmentsProgrammingSessions;

import java.util.Scanner;

public class IdentfyCharactor {

	public static void main(String[] args) {
		System.out.println("Enter a Charactor% ");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		sc.close();
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("its a uppercase alphabet");
		}
		
		else if(ch>='a' && ch<='z')
		{
			System.out.println("ist lower case alphabet");
		}
		
		else if(ch>='0' && ch<='9')
		{
			System.out.println("its a digit number");
		}
		
		else
		{
			System.out.println("its a charactor ");
		}

	}

}
