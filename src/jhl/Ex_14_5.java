package jhl;

import java.util.*;
import java.util.stream.*;

class Ex14_5 {
	public static void main(String[] args) {
		Stream<Student1> studentStream = Stream.of(
				new Student1("���ڹ�", 3, 300),
				new Student1("���ڹ�", 1, 200),
				new Student1("���ڹ�", 2, 100),
				new Student1("���ڹ�", 2, 150),
				new Student1("���ڹ�", 1, 200),
				new Student1("���ڹ�", 3, 290),
				new Student1("���ڹ�", 3, 180)
				);

		studentStream.sorted(Comparator.comparing(Student1::getBan) // �ݺ� ����
				.thenComparing(Comparator.naturalOrder()))     	// �⺻ ����
		.forEach(System.out::println);
	}
}

class Student1 implements Comparable<Student1> {
	String name;
	int ban;
	int totalScore;
	Student1(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
		return String.format("[%s, %d, %d]", name, ban, totalScore); 
	}

	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}

	// ���� ���������� �⺻ ���ķ� �Ѵ�.
	public int compareTo(Student1 s) { 
		return s.totalScore - this.totalScore;
	}
}