/*



0
10
010
1010
01010

 */
package patternPrograms;

public class Pattern5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i+j)%2 + " ");
			}

		System.out.println(" ");
		}

	}

}
