// real time program on 2 level upcasting 

class fatherInHome
{
	int age=55;
	void caring()
	{
		System.out.println("takes care of family");
	}

	void strict()
	{
		System.out.println("Strict in checking homework");
	}
}

class fatherInOffice extends fatherInHome
{
	void work()

	{
		System.out.println("works there !");
	}

	float salary= 25000.25f;
	
}

class father 

{
	public static void main(String[] args) 
	{
		fatherInOffice ref1=new fatherInOffice();
		System.out.println("father age is = " + ref1.age);
		ref1.caring();
		ref1.strict();

		ref1.work();
		System.out.println("father salary is = " + ref1.salary);

		fatherInHome ref2 = ref1;//upcasting
		System.out.println("father age is = " + ref2.age);
		ref2.caring();
		ref2.strict();

	}
}