package basicJavaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=1634;
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+(rem*rem*rem*rem);
			n=n/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}
