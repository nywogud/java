package jhl;

import java.util.Scanner;


public class Exam002_BMI_calulator {

	public static void main(String[] args) {
		String name;
		int age;
		double height;
		float weight;
		float bmi_index=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("����� �̸��� �Է��ϼ���.");
		name = sc.next();

		System.out.println("����� ���̸� �Է��ϼ���.");
		age = sc.nextInt();

		System.out.println("����� Ű�� �Է��ϼ���.");
		height = sc.nextDouble();

		System.out.println("����� �����Ը� �Է��ϼ���.");
		weight = sc.nextFloat();

		System.out.printf("%s���� ���� %d, Ű�� %1.1f, �����Դ� %1.1f �Դϴ�.\n", name, age, height, weight);

		bmi_index = ((float)weight / (float)(Math.pow(height*0.01, 2)));

		System.out.printf("����� BMI������ %1.1f �Դϴ�.\n", bmi_index);

		if (bmi_index <18.5) {
			System.out.println("��ü��");
		} else if (bmi_index>=18.5 && bmi_index<=22.9) {

			System.out.println("ü���� ������ ����");

		} else if (bmi_index>=23 && bmi_index<=24.9) {

			System.out.println("�� ���ܰ�");
		} else if (bmi_index>=25 && bmi_index<=29.9) {

			System.out.println("1�ܰ� ��");
		} else if (bmi_index>=30 && bmi_index<=34.9) {

			System.out.println("2�ܰ� ��");
		} else {

			System.out.println("3�ܰ� ��");
		}
	}

}
