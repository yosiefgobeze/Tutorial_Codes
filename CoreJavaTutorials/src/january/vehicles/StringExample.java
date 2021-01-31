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
		String ohio = "Ohio is a swing state";
		String question = ohio.substring(11, 14);
		System.out.println("Answer: " + question);
	}
}
