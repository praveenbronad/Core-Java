package arrayPracticePrograms;
//1.WAJP TO PRINT EVEN AND ODD NUMBERS FROM AN ARRAY?
import java.util.Scanner;

public class EvenOddNumbersInAnArray {

	public static void main(String[] args) {
		
		// import scanner class 
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		// take size of an array from user 
		int n= sc.nextInt();
		
		// Create a array 
		int a[] = new int[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<=n-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number elements are = " +a[i]);
			}
		}
		
		for(int i=0;i<=n-1;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("odd number elements are = " +a[i]);
			}
		}
		
		

	}

}
