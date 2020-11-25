package jhl;

import java.util.Objects;

class Person1{
	long id;

	Person1(){} // default 생성자 : instance 초기화 목적

	//초기화 생성자
	Person1(long id){
		super();
		this.id = id;
	}

	public int hashcode() {
		return Objects.hash(id);
	}
	
	
	//equals(Object obj)를 오버라이딩
	public boolean equals(Object obj) {
		if (obj instanceof Person1) {
			return this.id == ((Person1) obj).id;
		}else {return false;}
	}


}
public class Exam041ClassObjectMethod {

	public static void main(String[] args) {

		Person1 p1 = new Person1(9896121239485L);
		Person1 p2 = new Person1(9896121239485L);

		if (p1.equals(p2)) {
			System.out.println("같음.");
		}else {
			System.out.println("다름");
		}

		System.out.println(p1.id);
		System.out.println(p2.id);
	}
}
