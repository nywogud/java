//�л� ���� �Է� �ް� �������� ���� �ű��(���� 50~100, �̸��� 1,2,3,4...) ��� ���� ���ϱ�

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

		//ó���� �л��� �ο����� �Է� �޴´�.

		do {
			System.out.print("ó���� �л��� �ο����� ? ");
			student_Num = sc.nextInt();
		} while(student_Num <1);

		//		System.out.println(student_Num + "���� ����, ����, ���� ������ �Է¹ްڽ��ϴ�.");

		name = new String[student_Num];
		score =  new int[student_Num][3];
		total = new int[student_Num];
		rank = new int[student_Num];

		String[] subject = {"����==> ", "����==> ","����==>"};

		for (int i = 0; i<student_Num; i++) {
			name[i] = Integer.toString((int)(Math.random()*1000)+1);
			//			System.out.print("�̸�==> ");
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

