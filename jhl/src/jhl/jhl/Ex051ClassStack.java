package jhl;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex051ClassStack {
	public static void main(String[] args) {
		Stack st = new Stack();
		String expression = "(((3+8)*24/(4+8))";

		System.out.println("expression : " + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);

				if (ch=='(') {
					st.push(ch);
				} else if(ch==')') {
					st.pop();
				}
			}
			if (st.isEmpty()) {
				System.out.println("수식의 괄호가 정확합니다.");
			} else {
				System.out.println("###수식의 괄호가 부정확합니다.");
			}
			
		} catch(EmptyStackException e){
			
			System.out.println("수식의 괄호가 부정확합니다라구.");
			
		}

	}
}
