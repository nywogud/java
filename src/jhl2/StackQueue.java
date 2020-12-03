package jhl2;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackQueue {
	public static void main(String[] args) {
		Stack st = new Stack();
		String ex = "((3+5)*2/)2)))";

		try {
			for (int i=0;i<ex.length(); i++) {
				char cha = ex.charAt(i);

				if (cha=='(') {
					st.push(cha);
				}
				else if (cha==')'){
					st.pop();
				}
			}
			if (st.isEmpty()) {
				System.out.println("괄호가 일치함");
			}
			else {
				System.out.println("괄호가 일치하지 않음");
			}
		}
		catch(EmptyStackException e){
			System.out.println("괄호가 일치하지 않는다고요.");
		}
	}
}
