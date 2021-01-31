package january.vehicles;

import com.sun.jdi.PathSearchingVirtualMachine;

public class StringExample {

	public static void main(String[] args) {
		// a string is immutable in java, that means adding to a string literal will create new string
		String foo = "foo";
		foo = foo + "bar" + 1 + 2 + 3;
		System.out.println(foo);
		// StringBuilder is used to create a string but it is mutable, means more memory efficient.
		StringBuilder sb  = new StringBuilder("foo");
		sb.append("bar");
		sb.append(1).append(2).append(3);
		System.out.println(sb);
		
		// substring in java, 
		String ohio = "Ohio is a swing state                in 2021";
		String question = ohio.substring(11, 14);
		System.out.println("Answer: " + question);
		
		// indexOf
		int indexOf = ohio.indexOf("win");
		System.out.println("IndexOf win: " + indexOf);
		
		// charAt()
		char charAt15 = ohio.charAt(16);
		System.out.println("Char at 15 is: " + charAt15);
		
		// length()
		int len = ohio.length();
		System.out.println("String length is: " + len);
		
		// trim() removes white spaces at the end or beginning, will trim white space if there is no character after the space
		int trimmedLen = ohio.trim().length();
		System.out.println("Trimmed length is: " + trimmedLen);
		
		// string with white spaces only
		String mn = "   ";
		int length = mn.length();
		boolean check = mn.isEmpty();
		System.out.println("Lenght of the string: " + length + "\nIs it empty: " + check);
		
		// string with white spaces and trimmed
		String mnCopy = "   ";
		int lengthCopy = mn.trim().length();
		boolean checkCopy = mn.trim().isEmpty();
		System.out.println("Lenght of the string: " + lengthCopy + "\nIs it empty: " + checkCopy);
		
		// replace() method
		String ohioCopy = ohio.replace(" ", ",");
		System.out.println("Old ohio: " + ohio);
		System.out.println("Ohio copy: " + ohioCopy);
	}
}
