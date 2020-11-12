//학생 수만 입력 받고 랜덤으로 성적 매기고(범위 50~100, 이름은 1,2,3,4...) 평균 석차 구하기

package jhl;

import java.util.Scanner;

public class Exam009_score_proceccing {

	public static void main(String[] args) {

		String[] name;
		int[][] score;
		int total[];
		int student_Num;
		int[] rank;
		int rank_temp;
		Scanner sc = new Scanner(System.in);

		//처리할 학생의 인원수를 입력 받는다.

		do {
			System.out.print("처리할 학생의 인원수는 ? ");
			student_Num = sc.nextInt();
		} while(student_Num <1);

		//		System.out.println(student_Num + "명의 국어, 영어, 수학 점수를 입력받겠습니다.");

		name = new String[student_Num];
		score =  new int[student_Num][3];
		total = new int[student_Num];
		rank = new int[student_Num];

		String[] subject = {"국어==> ", "영어==> ","수학==>"};

		for (int i = 0; i<student_Num; i++) {
			name[i] = Integer.toString((int)(Math.random()*1000)+1);
			//			System.out.print("이름==> ");
			//			name[i] = sc.next();

			for (int j=0; j<subject.length; j++) {
				//				System.out.print(subject[j]);
				score[i][j] = (int) (Math.round(Math.random()*50)+50);
				total[i] += score[i][j];
			}
		}

		for (int i = 0; i<total.length; i++) {
			rank_temp = 1;
			for (int j=0; j<total.length; j++) {
				if (total[i]<total[j]) {
					rank_temp +=1;
				}
				rank[i] = rank_temp;
				}
			}
		

		System.out.println();

		for (int i=0; i<student_Num; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j<score[i].length; j++) {
				System.out.printf("%4d\t", score[i][j]);


			}
			System.out.printf("%4d\t %4.2f\t %4d\n",total[i], (float)total[i]/subject.length, rank[i]);

		}
	}
}

