package jhl;

import java.util.ArrayList;
import java.util.Scanner;

public class QData {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� x �Է�");
		int n = scan.nextInt();
		System.out.print("���� n �Է�");
		int x = scan.nextInt();

		ArrayList lst = new ArrayList(n);
		
		for (int i =0; i<=lst.size(); i++) {
			lst.add(i, i+1);
		}
		
		System.out.println(lst);
		
	}

}
