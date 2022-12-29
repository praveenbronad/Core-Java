package arrays;

public class SumOfAnArrayElements {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,67,8,9,4,5};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
		System.out.println("sum of all array elements= " + sum);

	}

}
