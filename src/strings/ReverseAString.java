package strings;

public class ReverseAString {

	public static void main(String[] args) {
		
		String s= "Welcome";
		String reversedString="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			
			reversedString+=ch;
		}
		System.out.println(reversedString);

	}

}
