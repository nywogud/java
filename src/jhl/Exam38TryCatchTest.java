package jhl;

public class Exam38TryCatchTest {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			Exception e = new Exception("고의로 에러를 발생시켰음.");
			System.out.println(4);
			throw e;
		} 

		catch(ArithmeticException  ae) {
			ae.printStackTrace();
			System.out.println("예외 메세지가 뭐? "+ae.getMessage());
			//			if (ae instanceof ArithmeticException) {
			//				System.out.println("0으로 나눴음.");
			//				System.out.println("ArithmeticEexeption");
			//			}

		} 

		catch(IndexOutOfBoundsException ie) {
			System.out.println("IndexOutOfBoundsException");
			System.out.println(ie);
			System.out.println(99);
		}

		catch(Exception e) {

			System.out.println("에러 발생");
			System.out.println("예외 메세지가 뭐? "+e.getMessage());
			System.out.println(99);
		} finally {
			System.out.println("프로그램 종료됨.");
		}
	}
}
