package jhl;

import java.util.ArrayList;
import java.util.Scanner;

public class QData {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("���ָ� ���Ϸ� �� ��� ���� �Է�.. ");
		int n = scan.nextInt();
		System.out.print("������ ��ȣ �Է�.. ");
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

		System.out.println("��� ��ȣ�� : "+ lst.get(0));
	}

}
