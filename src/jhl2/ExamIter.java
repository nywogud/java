package jhl2;

import java.util.ArrayList;
import java.util.Iterator;

public class ExamIter {
	public static void main(String[] args) {
		ArrayList<Object> arrList = new ArrayList<Object>();
		arrList.add("1");
		arrList.add(1);
		arrList.add("2");
		arrList.add(3);
		arrList.add("¹®ÀÚ");
		//		Object i =li.get(3);
		//		System.out.println(i);
		//		
		System.out.println(arrList.get(1));
		for (Object j:arrList) {
			System.out.print(j + " ");
			Iterator it = arrList.iterator();
			System.out.println(it);
			while(it.hasNext()) {
				Object obj = it.next();
				System.out.println(obj);
			}
			System.out.println();
			it = arrList.iterator();
			while(it.hasNext()) {
				Object obj = it.next();
				System.out.println(obj);
			}
		}
}}