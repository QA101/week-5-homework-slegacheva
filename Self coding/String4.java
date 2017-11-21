package hw5;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString(new String("Hello There")));

	}
public static String reverseString(String str) {
	String tmp=new String("");
	for (int i=str.length()-1; i>=0; i--) {
		tmp=tmp.concat(String.valueOf(str.charAt(i)));
	}
	return tmp;
}
}

