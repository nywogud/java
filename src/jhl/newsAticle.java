package jhl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class newsAticle {
	public static void main(String[] args) {
		String newsArticle = "Local and international experts shared their ideas on how South Korea should set its future diplomatic strategies and North Korea policy following the election of Joe Biden as the 46th U.S. president, during the Kor-Asia Forum 2020, Wednesday.\r\n"
				+ "\r\n"
				+ "The forum, co-hosted by The Korea Times and its sister paper the Hankook Ilbo, was held under the theme, \"In the Era of Biden: The Future of Asia and the Korean Peninsula,\" at The Shilla Seoul hotel. While experts here attended the forum in person, those from the U.S., Japan and China participated online due to the COVID-19 pandemic situation.";
		newsArticle = newsArticle.replaceAll("\"", "").replaceAll("\'s", "").replaceAll(",", "").replaceAll(":", "")
				.replaceAll("\\.", "").replaceAll("\r\n", "").toLowerCase();
		//���ڿ� �빮�ڸ� �ҹ��ڷ� �ٲٱ�

		String lst[] = newsArticle.split(" ");

		System.out.println(Arrays.toString(lst));
		System.out.println(Arrays.toString(lst));
		System.out.println();

		HashMap<String, Integer> dic = new HashMap<String, Integer>(); //��ųʸ��� ��ü ����
		//		dic.put("a", 2);
		//		dic.put("a", 1);



		for (int i=0; i<lst.length; i++) {
			int cnt = 0;
			for (int j=0; j<lst.length; j++) {

				if(lst[i].equals(lst[j])) {// $$���ڿ� �񱳿��� equals$$
					cnt += 1;

				}
				else {
					dic.put(lst[i], 1);
				}

			}
			dic.put(lst[i], cnt);


		}

		System.out.println(dic);

		// �������� ����, value�� ������ key ���� �������� ����
		// ����Ʈ�� ��ȯ. map���� sort�� ����

		List<Map.Entry<String, Integer>> list = new LinkedList<>(Map.entrySet());
		
	}
}


//class DescComp implements Comparator<Map.Entry<String, Integer>>{
//	
//}