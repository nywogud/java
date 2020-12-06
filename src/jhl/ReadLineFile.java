package jhl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ReadLineFile {
	public static void main (String[] args) throws IOException  {
		HashMap<String, String> hm = new HashMap<String, String>();
		String strLine = null;
		File file = new File("C:\\lecture\\tuto\\java\\voca.txt");
		if (file.exists()) {
			BufferedReader inFile = new BufferedReader(new FileReader(file));

			while((strLine = inFile.readLine())!=null) { 
				System.out.println(strLine);
				String[] temp = strLine.split(" ");
				hm.put(temp[0], temp[1]);
			}
			inFile.close();

		}		

		System.out.println(hm);



		//		Scanner sc = new Scanner(System.in);
		//		System.out.print("�떒�뼱瑜� �엯�젰�븯�꽭�슂...");
		//		String input = sc.next();
		//		System.out.println(input);
		//		if (hs.get(input) != null) { 
		//			System.out.println();
		//			System.out.println(hs.get(input));
		//		}
		//		else {
		//			System.out.println("李얜뒗 �떒�뼱媛� �궗�쟾�뿉 �뾾�쓬");
		//		}

		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.print("단어 게임 시작은's', 안하려면 'q' 입력...");
			String input = sc.next();

			System.out.println(input);
			input.trim();

			if (input.equalsIgnoreCase("s")) {
				break;

			}
			else if (input.equalsIgnoreCase("q")) {
				System.out.println("done");
				System.exit(0);
			}

			else {
				System.out.println("단어게임 하려면 제대로 입력.");
			}

		}

		System.out.println(hm.size());
		//		System.out.println(hs.g);

		System.out.println("게임시작");

		//		hm = new LinkedHashMap();

		List<String> key = new ArrayList<String>();
		List<String> value = new ArrayList<String>();
		System.out.println(hm.keySet());

		// 키와 값을 따로 담을 수 있는 각각의 리스트를 만든다.
		for(int i =0; i<hm.size(); i++) {
			key.addAll(hm.keySet()); 
		}

		System.out.println(key);

		for(int i =0; i<hm.size(); i++) {
			value.addAll(hm.values()); 
		}

		System.out.println(key);
		System.out.println(value);

		ArrayList<Integer> ranList = new ArrayList<Integer>();
		System.out.println(ranList.size());

		int ranIdx;
		while(ranList.size()<5) {
			ranIdx = 0;
			ranIdx = (int)((Math.random()*hm.size())+1);

			if (!(ranList.contains(ranIdx))){
				ranList.add(ranIdx);
			}
		}

		System.out.println(ranList);

		int i =0;
		int cnt = 0;
		while(i<5) {
			System.out.print(key.get(ranList.get(i))+"의 뜻을 한글로 작성... ");
			String answer = sc.next();
			answer.trim();
			if (answer.equals(value.get(ranList.get(i)))) {
				System.out.println("정답");
				cnt +=1;
			}
			else {
				System.out.println("오답");
				System.out.println("정답은 : " + value.get(ranList.get(i)));
			}
			i++;
		}
		sc.close();

		if (cnt==5) {
			System.out.println("만점");
		} else if(cnt==4) {
			System.out.println("80점.");
		} else if(cnt==3) {
			System.out.println("60점.");
		} else if(cnt==2) {
			System.out.println("40점.");
		} else if(cnt==1) {
			System.out.println("20점.");
		} else if(cnt==0) {
			System.out.println("0점.");
		}
	}
}