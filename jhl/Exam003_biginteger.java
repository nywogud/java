package jhl;

import java.math.BigInteger;

public class Exam003_biginteger {
	public static void main(String[] args) {
		BigInteger a =  BigInteger.valueOf(100_000_000);//1¾ï
		BigInteger b =  BigInteger.valueOf(200_000_000);//2¾ï
		
		BigInteger c = a.multiply(b);
		System.out.println(c);
	}
}
