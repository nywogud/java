package jhl;

import java.util.ArrayList;
import java.util.Iterator;

public class Exam72ClassGennelicType {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("jhl0", 90, 1));
		list.add(new Student("jhl1", 91, 2));
		list.add(new Student("jhl2", 92, 3));
		list.add(new Student("jhl3", 93, 4));
		list.add(new Student("jhl4", 94, 5));
		list.add(new Student("jhl5", 95, 6));
		
//		System.out.println(list);
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.printf("%s     %d     %d\n", s.name, s.grade, s.no );
		}
		
	}
}

class Student{
	String name;
	int grade;
	int no;

	Student(String name, int grade, int no){
		this.name = name;
		this.grade = grade;
		this.no = no;
	}

}