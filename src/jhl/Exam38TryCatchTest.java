package jhl;

public class Exam38TryCatchTest {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			Exception e = new Exception("���Ƿ� ������ �߻�������.");
			System.out.println(4);
			throw e;
		} 

		catch(ArithmeticException  ae) {
			ae.printStackTrace();
			System.out.println("���� �޼����� ��? "+ae.getMessage());
			//			if (ae instanceof ArithmeticException) {
			//				System.out.println("0���� ������.");
			//				System.out.println("ArithmeticEexeption");
			//			}

		} 

		catch(IndexOutOfBoundsException ie) {
			System.out.println("IndexOutOfBoundsException");
			System.out.println(ie);
			System.out.println(99);
		}

		catch(Exception e) {

			System.out.println("���� �߻�");
			System.out.println("���� �޼����� ��? "+e.getMessage());
			System.out.println(99);
		} finally {
			System.out.println("���α׷� �����.");
		}
	}
}
