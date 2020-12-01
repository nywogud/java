package jhl;

@FunctionalInterface
interface MyFunction12{
	void run();
}

public class Exam91ClassLambda {
	static void execute(MyFunction12 f) {
		f.run();
	}

	static MyFunction12 getMyFunction() {
		MyFunction12 f = ()-> System.out.println("f3.run()");
		return f;
	}
	public static void main(String[] args) {

		MyFunction12 f1 = () -> System.out.println("f1.run()");
		MyFunction12 f2 = new MyFunction12() {
			
			
			public void run() {
				System.out.println("f2.run()");
			}
		};


		f1.run();
		f2.run();
		
		MyFunction12 f3 = getMyFunction(); // MyFunction12 f3= f
		f3.run();
		
		execute(f1);
		execute(f2);
		execute(f3);
		
		execute(() -> System.out.println("run()"));
		
	}
}
