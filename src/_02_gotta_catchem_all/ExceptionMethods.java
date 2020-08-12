package _02_gotta_catchem_all;

import java.util.Stack;

public class ExceptionMethods {
	double divide(double a, double b) throws IllegalArgumentException {
		if(b == 0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	String reverseString(String e) throws IllegalStateException{
		if(e.equals("")) {
			throw new IllegalStateException();
		}
		String reverse = "";
		Stack<String> back = new Stack<String>();
		for (int i = 0; i < e.length(); i++) {
			back.add(e.charAt(i)+"");
		}
		for (int i = 0; i < e.length(); i++) {
			reverse += back.pop()+"";
		}
		return reverse;
	}
}

	