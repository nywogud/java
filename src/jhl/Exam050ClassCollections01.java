package jhl;

import java.util.ArrayList;
import java.util.Collections;

public class Exam050ClassCollections01 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);//����, Creation
		
//		list1.add(new Integer(5)); // �̷��� �ۼ��ϴ� ���� ��Ģ.
		list1.add(5); // �̰��� ������ ������ autoboxing�� ���ֱ� ����.
		list1.add(4);
		list1.add(2);
		list1.add(1);
		list1.add(3);
		
		ArrayList list2 = new ArrayList<>(list1.subList(1, 4));//����
		print(list1, list2);
		
		
		System.out.println();
		
		System.out.println("������������ ����");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println(list1.get(0));//���� ���
		System.out.println(list1.indexOf(5));//���� ���. �ε��� �� ��������
		System.out.println(list1.set(1, 4));// Update
		System.out.println(list1.remove(1));// Delete
		print(list1, list2);
		System.out.println("list1�� size�� ? " + list1.size());
		
		System.out.println("�������� ����");
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
		
//		System.out.println(list1.get(new Integer(0))); // �̰� ��Ģ
		System.out.println(list1.get(0)); // �̰��� ������ ���� unboxing �����ϱ� ����. 
		
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println();
	}
}
