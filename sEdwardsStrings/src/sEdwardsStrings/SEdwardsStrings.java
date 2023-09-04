/**
 * 
 */
package sEdwardsStrings;

/**
 * @author Shane Edwards 
 *
 */
public class SEdwardsStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testString = "Hello World!";
		String testString2 = "";
		
		for(int i = 0; i < testString.length(); i++)
		{
			System.out.print(testString.charAt(i));
		}
		System.out.println();
		
		for(int i = testString.length()-1; i >= 0; i--)
		{
			System.out.print(testString.charAt(i));
		}
		System.out.println();
		
		testString2 = "";
		for(int i = testString.length()-1; i >= 0; i--)
		{
			testString2 = testString.charAt(i) + testString2 + testString.charAt(i);
		}
		System.out.println(testString2);
		
	}

}
