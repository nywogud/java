package jhl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamArray {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=4;
		arr[1]=7;
		arr[2]=1;
		arr[3]=9;
		arr[4]=5;
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int idx = Arrays.binarySearch(arr, 1);
		System.out.println(idx);
		
	}
}
