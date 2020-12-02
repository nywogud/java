package jhl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam100Functionpackage3 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<10; i++) {
			list.add(i);
		}

		list.forEach(i->System.out.print(i+ ", "));
		
		System.out.println();
		
		System.out.println(list);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		list.removeIf(xx->xx%2==0 || xx%3==0);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("±è¼¼¿¬", "010-1234-5678");
		map.put("ÀÌ¼ö±Ù", "010-1588-1588");
		map.put("°­È£µ¿", "010-9988-8899");
		map.put("±è¿µÃ¶", "010-4457-9685");
		map.put("±èÈñÃ¶", "010-9588-0365");
		System.out.println();
		map.forEach((k,v)-> System.out.println(k + "ÀÇ ÀüÈ­¹øÈ£´Â " + v));
		
		
	}
}
