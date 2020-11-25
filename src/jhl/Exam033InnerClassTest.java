package jhl;

class AAA{
	int i =100;
	BBB b = new BBB();

	class BBB {
		void method() {
			System.out.println(i);
		}
	}

}


public class Exam033InnerClassTest {
	public static void main(String[] args) {

		AAA a = new AAA();
		a.b.method();

	}
}
