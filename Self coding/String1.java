package hw5;
import java.util.ArrayList;
// Return the number of times that the string "code" appears anywhere 
//in the given string, except we'll accept any letter for the 'd',
//so " cope" and "code" count.

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
  System.out.println(countCode(new String("aaacodebbb")));
	
}
	public static int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == 'c') {
				if (str.charAt(i+1) == 'o') {
					if (str.charAt(i+3) == 'e') {
						count ++;
					}
					
			}
			}
			
		}
		return count;
	
	}

}
