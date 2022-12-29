//WAJP TO READ SIDE OF A SQUARE BASED ON THAT CALCULATE AND PRINT AREA?
package basicJavaPrograms;

import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		// import scanner class
		Scanner sc= new Scanner(System.in);
		System.err.println("Enter side of Squre ");
		
		float side=sc.nextFloat();
		sc.close();
		float areaOfSquare= side*side;
		
		System.out.println("the area of square is = " + areaOfSquare + " units ");
		
	}
}
