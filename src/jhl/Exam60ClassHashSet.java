package jhl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam60ClassHashSet {
	public static void main(String[] args) {
		Object[] objs = {"1", 1, "2","3","3","4","4"};
		Set set = new HashSet();
		
		for (int i=0; i<objs.length; i++) {
			set.add(objs[i]);
		}
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //한개씩 내용 출력
		}
		
		
	}
}
