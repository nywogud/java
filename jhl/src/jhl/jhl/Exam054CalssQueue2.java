package jhl;

import java.util.Arrays;

public class Exam054CalssQueue2 {
	public static void main(String[] args) {
		//Arrays.toString(arr) 배열 출력
		//Arrays.deepToString(arr2) 2차원 배열 출력, 3차원도 가능함.
		
		int [] arr = {0,1,2,3,4,5};
		int [][] arr2d = {{10,11,12}, {100,110,120}};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2d));
		
		//3차원 배열의 출력
		
		int[][][] arr3d = {{{10,20},{1,2}}, {{8,9},{19, 17}}, {{10,20},{1,2}}, {{8,9},{19, 17}}};
		System.out.println(Arrays.deepToString(arr3d));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0,7);
		
		System.out.println("arr2 :" + Arrays.toString(arr2));
		System.out.println("arr3 :" + Arrays.toString(arr3));
		System.out.println("arr4 :" + Arrays.toString(arr4));
		System.out.println("arr5 :" + Arrays.toString(arr5));
		System.out.println("arr6 :" + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 7);
		System.out.println("arr7 : " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);//자바의 람다
		System.out.println("arr7 : " + Arrays.toString(arr7));
		
		for (int i : arr7) {
			char[] bar = new char[i];
			Arrays.fill(bar, '#');
			System.out.println(Arrays.toString(bar)+ " "+ i);
		}
		
		String [][] str2D = new String[][] {{"aaa", "bbb"},{"AAA", "BBB"}};
		String [][] str2D2 = new String[][] {{"aaa", "bbb"},{"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		
	}
}
