package jhl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam101ClassFunctionPackage3 {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("�̿��", "������", "������", "������", "���ÿ�", "���ֶ�");
//
//		//����ó��
//
//		Stream<String> parallrstream = list.parallelStream();
//		parallrstream.forEach(Exam101ClassFunctionPackage3::print);//�޼ҵ� ����
		
		IntStream intStream = new Random().ints(1, 46);
		
//		intStream.forEach(i->System.out.print(i + ", ")); //�ȵ�.
		intStream.distinct().limit(6).sorted().forEach(System.out::println);
		
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
