package jhl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student12{
	private String name;
	private int score;

	public Student12(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}

public class Exam103ClassFunctionPackage5 {
	public static void main(String[] args) {
		List <Student12> list = Arrays.asList(
				new Student12("������", 80),
				new Student12("���ֶ�", 70),
				new Student12("����õ", 60),
				new Student12("������", 80),
				new Student12("���ȯ", 90),
				new Student12("�̼Ҿ�", 60)
				);
		double avg = list.stream().mapToInt(Student12::getScore)
					.average().getAsDouble();
		System.out.printf("�л����� ����� : %3.2f", avg);
		
		
	}
}
