// 0  1  1  2  3  5  8  
package basicJavaPrograms;
// 0   1   1  2  3  5  8  13  
public class FabonachiSeries {
	
	public static void main(String[] args) 
	{
			int a =0;
			int b=1;
			int sum=0;
			
			System.out.println(a);
			System.out.println(b);
		for(int i=0;i<=5;i++)
		{
			
			sum=a+b;
			a=b;
			b=sum;
			
			System.out.println(sum);
		}
		
	}

}
