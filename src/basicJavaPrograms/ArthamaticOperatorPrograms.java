package basicJavaPrograms;

import java.util.Scanner;

public class ArthamaticOperatorPrograms {

	public static void main(String[] args) {
		
		// import scanner class 
		
		Scanner s= new Scanner(System.in);
		
		// use referance variable 
		
		System.out.println("enter number 1");
		System.out.println("enter number 2");
		
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1/n2);
		System.out.println(n1*n2);
		


	}

}
