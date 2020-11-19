package jhl;

public class Ex044ClassMath {
	public static void main(String[] args) {
		double sum = 0, sum1 = 1, sum2 = 0;
		for (double d=1.5; d<=10.5; d++) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);

			System.out.printf("%4.1f %4.1f %4.1f", d, d1, d2);

			sum += d;
			sum1 += d1;
			sum2 += d2;

		}

		System.out.println("------------------------------------------------");
		System.out.printf("%4.1f %4.1f %4.1f", sum, sum1, sum2);

	}
}
