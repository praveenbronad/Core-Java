package excpetion;

public class Exception1 {

	public static void main(String[] args) 
	{
		
		 { try { int a=10/0;
		 System.out.println(a); 
		 } 
		 catch (Exception e) 
		 { System.out.println("Exception handled"); 
		 } 
		 finally 
		 { System.out.println("Finally block");
		 }
		 
		 }
	}

}
