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

		System.out.println("당신의 이름을 입력하세요.");
		name = sc.next();

		System.out.println("당신의 나이를 입력하세요.");
		age = sc.nextInt();

		System.out.println("당신의 키를 입력하세요.");
		height = sc.nextDouble();

		System.out.println("당신의 몸무게를 입력하세요.");
		weight = sc.nextFloat();

		System.out.printf("%s님의 나이 %d, 키는 %1.1f, 몸무게는 %1.1f 입니다.\n", name, age, height, weight);

		bmi_index = ((float)weight / (float)(Math.pow(height*0.01, 2)));

		System.out.printf("당신의 BMI지수는 %1.1f 입니다.\n", bmi_index);

		if (bmi_index <18.5) {
			System.out.println("저체중");
		} else if (bmi_index>=18.5 && bmi_index<=22.9) {

			System.out.println("체질량 지수는 정상");

		} else if (bmi_index>=23 && bmi_index<=24.9) {

			System.out.println("비만 전단계");
		} else if (bmi_index>=25 && bmi_index<=29.9) {

			System.out.println("1단계 비만");
		} else if (bmi_index>=30 && bmi_index<=34.9) {

			System.out.println("2단계 비만");
		} else {

			System.out.println("3단계 비만");
		}
	}

}
