package jhl2;

public class MainTest {
	public static void main(String[] args) {
		A12 a = new A12();
		a.huh(3);//�޼��� �����ε�
		a.huh("String");//�޼��� �����ε�
		System.out.println(a.x);
		System.out.println((int)Math.floor(Math.random()*10));
	}
}

class A12{
	int x;
	A12(){
		this(1);
	}

	A12(int x){
		this.x = x;
	}

	void huh(String a) {
		System.out.println(a);
	}

	void huh(int a) {
		System.out.println(a);
	}
}