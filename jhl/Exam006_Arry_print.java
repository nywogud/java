package jhl;

import java.util.Arrays;

public class Exam006_Arry_print {

	public static void main(String[] args) {
		int[] arr = {4,34,3,5,76};
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+ "");
		}

		for (int i :arr) {
			System.out.println(i);
		}
		
	}

}
