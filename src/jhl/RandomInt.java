package jhl;

import java.util.Scanner;

public class RandomInt {
	public static void main(String[] args) {
		int randomDigit = (int) (Math.random() * 100+1);

		System.out.println();

		System.out.print("1-100���� ���� ���߱� :");
		Scanner sc = new Scanner(System.in);
		
		//min ���� max ���� �ְ� �Է� ���� �� ���� ���� ��ü��

		int insertDigit = sc.nextInt();
		
		int rotation = 0;
		
		while(randomDigit!=insertDigit) {
			
			if (insertDigit > randomDigit) {
				
				System.out.println("�Է��� ��("+ insertDigit + ") ���� ���� ����.");
				insertDigit = sc.nextInt();
				rotation += 1;
				
			}else if (insertDigit < randomDigit){
				
				System.out.println("�Է��� ��("+ insertDigit + ") ���� ū ����.");
				insertDigit = sc.nextInt();
				rotation += 1;
			}
		}
		
		System.out.println("����. " + rotation + "ȸ�� �õ� ���� ����");

	}
}
