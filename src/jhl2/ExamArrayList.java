package jhl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExamArrayList {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(new String("1"));//�̰� ��Ģ
		al.add(1);
		al.add("2");// ���. �����Ϸ��� ����ڽ����༭ ����.
		al.add(3);
		al.add("4");
		
		ArrayList list2 = new ArrayList(al.subList(1, 4));
		
		
		
		System.out.println(al.get(1));
		System.out.println(Arrays.toString(arr));
		System.out.println(list2);
		System.out.println(list2);
	}
}
