package com.praticeprogrammes.arrays;



public class SumOfanArrayElements {

	public static void main(String[] args) {
		
		int a[]= {12,13,45,15};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
