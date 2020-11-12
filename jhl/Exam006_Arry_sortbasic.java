package jhl;

import java.util.Arrays;

public class Exam006_Arry_sortbasic {

	public static void main(String[] args) {
		int[] arr = {4,34,3,5,76};
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		String[] fruits = {"apple", "orange", "kiwi", "strawberry", "melon"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
	}

}
