package jhl;

import java.util.TreeSet;

public class Ex63CalssTreeSet1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
//		String from = "b";
//		String to = "d";
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		
		
		System.out.println(set);
//		System.out.println("range from " + from + " to " + to);
//		System.out.println("result1 :  " + set.subSet(from, to));
//		System.out.println("result2 :  " + set.subSet(from, to + "zzz"));
		System.out.println(set.headSet(3));
		System.out.println(set.tailSet(3));
	}
}
