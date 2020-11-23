package jhl;

import java.util.ArrayList;
import java.util.Scanner;

public class QData {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("공주를 구하러 갈 기사 숫자 입력.. ");
		int n = scan.nextInt();
		System.out.print("제외할 번호 입력.. ");
		int x = scan.nextInt();

		ArrayList lst = new ArrayList();

		for (int i =0; i<n; i++) {
			lst.add(i+1);
		}

		while(lst.size()!=1) {
			for (int i=0;i<x-1; i++) {
				int a = (int)lst.get(0);
				lst.remove(0);
				lst.add(a);
				
			}
			lst.remove(0);
		}

		System.out.println("기사 번호는 : "+ lst.get(0));
	}

}
