// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/ lower case differences
// in other words, the computation should not be "case sensitive". Note: str.to LowerCase()returns the lowercase version of a string.
package hw5;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(EndOfString(new String ("Hiabc"), new String("abc")));
	}

	public static boolean EndOfString(String str1, String str2) {
		if (str1.toLowerCase().endsWith(str2.toLowerCase()) || str1.toLowerCase().endsWith(str1.toLowerCase())) {
      return true;
	}
	else
		return false;
	
}
}
