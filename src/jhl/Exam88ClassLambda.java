package jhl;

@FunctionalInterface
interface MyFunction {
	public abstract int method(int x, int y);// �߻� �޼ҵ�
}

@FunctionalInterface
interface SingleOperator {
	public abstract int method(int x);// �߻� �޼ҵ�
}

@FunctionalInterface
interface VoidOperator {
	public abstract void method();// �߻� �޼ҵ�
}

public class Exam88ClassLambda {

	public static void main(String[] args) {
		MyFunction max, sum, mul;
		SingleOperator squre;
		VoidOperator message;

		max = (a, b) -> a>b ? a:b;
		System.out.println(max.method(4, 7));

		sum = (a,b) -> a+b;
		System.out.println(sum.method(5, 4));

		mul = (a,b) -> a*b;
		System.out.println(mul.method(6, 7));

		squre = (a) -> a*a;
		System.out.println(squre.method(6));
		
		message = () -> System.out.println("void lambda");
		message.method();
	}
	static int total(int x, int y){
		return x+y;
	}

}
