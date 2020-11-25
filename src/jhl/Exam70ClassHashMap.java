package jhl;

import java.util.HashMap;
import java.util.TreeMap;

public class Exam70ClassHashMap {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("john", "john1234");
		map.put("paul", "john1234");
		map.put("Terminator", "mc1-0b");
		map.put("Terminator", "T10");
		map.put("abc", "abcmart");
		map.put("Pengsu", "ebs1234");
		
		System.out.println(map);// 순서 없고 키 중복 허락 안됨. 키 값 중복 되면 마지막 것 반환. 밸류값은 중복 가능
		System.out.println("keySet : " + map.keySet());
		System.out.println("values : " + map.values());
		System.out.println("entrySet : "+ map.entrySet());
		map.remove("paul");
		System.out.println(map);
		
		
//		Scanner s = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("아이디와 패스워드 입력");
//			System.out.println("아이디 : ");
//			String id = s.nextLine().trim();
//			
//			System.out.println("패스워드 : ");
//			String pw = s.nextLine().trim();
//			System.out.println();
//			
//			if (! map.containsKey(id)) {
//				System.out.println("아이디가 없음... 다시입력");
//				continue;
//			}
//			
//			if (! (map.get(id)).equals(pw)) {
//				System.out.println("비밀번호가 일치하지 않음. 다시 입력");
//				
//			} else {
//				System.out.println("로그인 실행");
//				System.out.println(".");
//				System.out.println(".");
//				System.out.println(".");
//				break;
//			}
//		}
		
		
	}
}
