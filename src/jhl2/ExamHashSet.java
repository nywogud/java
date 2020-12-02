package jhl2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExamHashSet {
	public static void main(String[] args) {
		Object[] objArr = {"1", 1, "2", "3","2","4","2"};
		Set<Object> set = new HashSet<Object>();
		
		for(Object i:objArr) {
			set.add(i);
		}
		
		System.out.println(set);
		System.out.println(Arrays.toString(objArr));
		
	}
}
