// Given a string of even length, return the first half. So string Woohoo yields Woo
package hw5;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( firstHalf ("Woohoo"));
	}

	public static String firstHalf(String str) {
		String halfString;
		if (str.length()%2 == 0) {
			halfString = str.substring(0,str.length()/2);
			return halfString;
		}
		else {
			return str;
		}
	}
}
