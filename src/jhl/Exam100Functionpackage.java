package jhl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exam100Functionpackage {
	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)((Math.random()*100)+1);
		Consumer<Integer> c = i -> System.out.println(i + " ");
		Predicate<Integer> isEven = i -> i%2==0;
		Function<Integer, Integer> f = i -> i/10*10; //단단위 제거

		for (int i=0; i<10; i++) {

			System.out.print(s.get() + " ");

		}
		System.out.println();
		c.accept(10);
		System.out.println(isEven.test(10));
		System.out.println(f.apply(77));

		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s,list);
		System.out.println(list);
		evenNumber(isEven,c,list);
	}
	
	static <T> void makeRandomList(Supplier<T> s, List<T>list) {
		for (int i=0; i<10; i++) {
			list.add(s.get());
		}
	}
	
	static <T> void evenNumber(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[ ");
		for (T i: list) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
		System.out.print("]");
	}	
}