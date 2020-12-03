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
				System.out.println("��ȣ�� ��ġ��");
			}
			else {
				System.out.println("��ȣ�� ��ġ���� ����");
			}
		}
		catch(EmptyStackException e){
			System.out.println("��ȣ�� ��ġ���� �ʴ´ٰ��.");
		}
	}
}
