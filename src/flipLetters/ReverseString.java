/**
 * 
 */
package flipLetters;

/**
 * @author NathanClarke
 *
 */

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Excellent";
		
		String[] str_array = s.split(" ");
		
		for(String str : str_array) {
			char[] cArray = str.toCharArray();
			for(int i = 0; (i < (str.length() / 2)); i++) {
				
				char tempA = cArray[i];
				char tempB = cArray[str.length() - (i + 1)];
				
				cArray[i] = tempB;
				cArray[str.length() - (i + 1)] = tempA;
			}
			String ans = String.valueOf(cArray);
			System.out.print(ans + " ");
		}

	}

}
