
//WAJP TO READ THE PERSON NAME,AGE,MOBILE NUMBER AND CITY NAME?
package basicJavaPrograms;

import java.util.Scanner;

public class Assignemnt3 
{
	public static void main(String[] args) {
		
		//import scanner class
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your name ");
	String name=sc.next();
	
	System.out.println("Enter your Age");
	int age=sc.nextInt();
	
	System.out.println("Enter your Mobile Number");
	
	long mobileNo= sc.nextLong();
	
	System.out.println("Enter your City Name ");
	String city=sc.next();
	
	sc.close();
	
	System.out.println("welcome Mr. " + name );
	System.out.println("you have entered age as =  " + age );
	System.out.println("you have entered mobile number  as =  " + mobileNo );
	System.out.println("you have entered city  as =  " + city );
		
	}
}
