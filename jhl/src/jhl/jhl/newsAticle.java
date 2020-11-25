package jhl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class newsAticle {
	public static void main(String[] args) {
		String newsArticle = "Justice Minister Choo Mi-ae on Tuesday suspended Prosecutor General Yoon Seok-youl from his duty, in an unprecedented move amid a feud over prosecution reforms and various investigations involving Yoon's aide and family members.\r\n"
				+ "\r\n"
				+ "\"The ministry has been investigating various allegations against the top prosecutor and found out some serious misconduct,\" the justice minister said during a briefing.\r\n"
				+ "\r\n"
				+ "As reasons to bar him from his duty and seek disciplinary actions, the minister cited what she called an \"improper\" meeting with a media executive, the illegal inspection of judges involved in controversial cases, interference with the prosecution's investigations to protect people close to him and damage to public trust in the political neutrality of the prosecution. She also cited his alleged leak of information to the press on the Supreme Prosecutors Office's launch of an audit into his close aide involved in an alleged blackmail case.\r\n"
				+ "\r\n"
				+ "She said that Yoon violated ethics by meeting with Hong Seok-hyun, chairman of JoongAng Holdings, the media group that owns local daily JoongAng Ilbo and cable channel JTBC, in November 2018, who could be an interested party in a case being probed by prosecutors. Yoon was the chief prosecutor at the Seoul Central District Prosecutors Office at that time. Choo didn't offer further details.\r\n"
				+ "\r\n"
				+ "She also said Yoon had impeded the ministry's lawful probe by not responding to recent written investigation inquiries.\r\n"
				+ "\r\n"
				+ "\"As the justice minister, who has the utmost authority to oversee the prosecution, I decided that it is not tolerable to let him continue his duty,\" Choo said.\r\n"
				+ "";
		newsArticle = newsArticle.replaceAll("\"", "");
		newsArticle = newsArticle.replaceAll("\'s", "");
		newsArticle = newsArticle.replaceAll(",", "");
		newsArticle = newsArticle.replaceAll("\\.", "");
		//문자열 대문자를 소문자로 바꾸기
		
		String lst[] = newsArticle.split(" ");
		
		System.out.println(Arrays.toString(lst));
		System.out.println();
		
		HashMap<String, Integer> dic = new HashMap<String, Integer>(); //딕셔너리로 객체 생성
		
		int cnt = 0;
		for (int i=0; i<lst.length; i++) {
			for (int j=0; j<lst.length; j++) {
				if(lst[i]==lst[j]) {
					cnt += 1;
					dic.put(lst[i], cnt);
				} else {
					dic.put(lst[i], cnt+1);
				}
			}
		}
		
		System.out.println(dic);
//		Collections;
		// 빈도수로 내림차순 정렬하고 0~9 인덱스를 출력하면 됨.
				
	}
}
