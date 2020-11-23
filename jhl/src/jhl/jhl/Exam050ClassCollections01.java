package jhl;

import java.util.ArrayList;
import java.util.Collections;

public class Exam050ClassCollections01 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);//생성, Creation
		
//		list1.add(new Integer(5)); // 이렇게 작성하는 것이 원칙.
		list1.add(5); // 이것이 가능한 이유는 autoboxing을 해주기 때문.
		list1.add(4);
		list1.add(2);
		list1.add(1);
		list1.add(3);
		
		ArrayList list2 = new ArrayList<>(list1.subList(1, 4));//생성
		print(list1, list2);
		
		
		System.out.println();
		
		System.out.println("오름차순으로 정렬");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println(list1.get(0));//리드 방식
		System.out.println(list1.indexOf(5));//리드 방식. 인덱스 값 가져오기
		System.out.println(list1.set(1, 4));// Update
		System.out.println(list1.remove(1));// Delete
		print(list1, list2);
		System.out.println("list1의 size는 ? " + list1.size());
		
		System.out.println("내림차순 정력");
		Collections.sort(list1, Collections.reverseOrder());
		Collections.sort(list2, Collections.reverseOrder());
		
		print(list1, list2);
		
		list1.add(2);
		System.out.println(list1.containsAll(list2));
		
		list2.add("ABC");
		
		print(list1, list2);
		
		list2.add("1");
		list2.add(1);
		
		print(list1, list2);
		
		for (int i = list2.size()-1; i >=0; i--) {
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		
		print(list1,list2);
		
		System.out.println("list1 = " + list1);
		
//		System.out.println(list1.get(new Integer(0))); // 이게 원칙
		System.out.println(list1.get(0)); // 이것이 가능한 것은 unboxing 지원하기 때문. 
		
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println();
	}
}
