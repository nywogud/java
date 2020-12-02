package jhl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam101ClassFunctionPackage3 {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("이용원", "고은서", "정원준", "김혜은", "이택영", "김휘람");
//
//		//순차처리
//
//		Stream<String> parallrstream = list.parallelStream();
//		parallrstream.forEach(Exam101ClassFunctionPackage3::print);//메소드 참조
		
		IntStream intStream = new Random().ints(1, 46);
		
//		intStream.forEach(i->System.out.print(i + ", ")); //안됨.
		intStream.distinct().limit(6).sorted().forEach(System.out::println);
		
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
