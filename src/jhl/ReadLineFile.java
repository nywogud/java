package jhl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReadLineFile {
	public static void main (String[] args) throws IOException  {
		Map<String, String> hm = new HashMap<String, String>();
		String strLine = null;
		File file = new File("C:\\Users\\jhl\\Desktop\\test.txt");
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
		//		System.out.print("단어를 입력하세요...");
		//		String input = sc.next();
		//		System.out.println(input);
		//		if (hs.get(input) != null) { 
		//			System.out.println();
		//			System.out.println(hs.get(input));
		//		}
		//		else {
		//			System.out.println("찾는 단어가 사전에 없음");
		//		}

		Scanner sc = new Scanner(System.in);
		

		while(true) {
			System.out.print("단어 맞추기 게임 할 거면 's', 아니면 'q' 입력...");
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
				System.out.println("할지 말지 정확히 입력");
			}
		}
		
		System.out.println(hm.size());
//		System.out.println(hs.g);

		System.out.println("게임시작");
		
//		hm = new LinkedHashMap();
		
		List<String> key = new ArrayList<String>();
		List<String> value = new ArrayList<String>();
		System.out.println(hm.keySet());
		
		
		for(int i =0; i<hm.size(); i++) {
			key.addAll(hm.keySet()); //키 값과 밸류 값을 각각의 !!!!리스트!!!!로 받아온다.
		}
		
		System.out.println(key);
		
		for(int i =0; i<hm.size(); i++) {
			value.addAll(hm.values()); //키 값과 밸류 값을 각각의 !!!!리스트!!!!로 받아온다.
		}
		
		System.out.println(key);
		System.out.println(value);
		
		int i = 0;
		while(i <=4 ) {
			int j = (int)(Math.random()*) ;
			i ++;
			System.out.println(j);
		}
		

	}
}