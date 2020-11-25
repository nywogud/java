package jhl;

한해 달력 출력하기

import java.util.Calendar;

public class Exam045Calendar {
	public static void main(String[] args) {

		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;

		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		sDay.set(year, month-1, 1); //월이 0부터 시작한다는 것을 주의해야 함.
		eDay.set(year, month, 1); // 그 다음 달의 첫날로 셋을 하고

		eDay.add(Calendar.DATE, -1);// 이 과정을 거치면 따로 그 전달 마지막 날짜 확일할 필요가 없음.

		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);//첫째일이 무슨 요일인지... 즉 몇 칸을 움직일지 계산
		END_DAY = eDay.get(Calendar.DATE);// 지정한 날짜를 얻어온다.

		System.out.println("               " + year+"년 " + month + "월");
		System.out.println("SU    MO    TU    WE    TH    FR    SA");

		for (int i =1; i<START_DAY_OF_WEEK; i++) {
			System.out.println("    ");
		}

		// 여기서부터
		for (int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++, n++) {
			System.out.print((i<10)? "  "+i : "    "+i);
			if (n%7==0) System.out.println();
		}


	}

}


