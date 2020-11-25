package jhl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exam051ClassStack {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();

		st.push("0");	
		st.push("1");	
		st.push("2");	
		st.push("3");	
		st.push("4");
		// stack: 가장 먼저 들어간 놈이 가장 나중에 나옴.

		q.offer("0");
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		// Queue : 가장 먼저 들어간 놈이 가장 먼저 나옴. 
	

		while(!st.empty()) {
			System.out.println(st.pop());
		}

// 결과		
//		4
//		3
//		2
//		1
//		0
		
		System.out.println();
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

// 결과
//		0
//		1
//		2
//		3
//		4


	}
}
