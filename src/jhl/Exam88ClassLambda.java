package jhl;

@FunctionalInterface
interface MyFunction {
	public abstract int method(int x, int y);// 추상 메소드
}

@FunctionalInterface
interface SingleOperator {
	public abstract int method(int x);// 추상 메소드
}

@FunctionalInterface
interface VoidOperator {
	public abstract void method();// 추상 메소드
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
