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
		
		System.out.println(map);// ���� ���� Ű �ߺ� ��� �ȵ�. Ű �� �ߺ� �Ǹ� ������ �� ��ȯ. ������� �ߺ� ����
		System.out.println("keySet : " + map.keySet());
		System.out.println("values : " + map.values());
		System.out.println("entrySet : "+ map.entrySet());
		map.remove("paul");
		System.out.println(map);
		
		
//		Scanner s = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("���̵�� �н����� �Է�");
//			System.out.println("���̵� : ");
//			String id = s.nextLine().trim();
//			
//			System.out.println("�н����� : ");
//			String pw = s.nextLine().trim();
//			System.out.println();
//			
//			if (! map.containsKey(id)) {
//				System.out.println("���̵� ����... �ٽ��Է�");
//				continue;
//			}
//			
//			if (! (map.get(id)).equals(pw)) {
//				System.out.println("��й�ȣ�� ��ġ���� ����. �ٽ� �Է�");
//				
//			} else {
//				System.out.println("�α��� ����");
//				System.out.println(".");
//				System.out.println(".");
//				System.out.println(".");
//				break;
//			}
//		}
		
		
	}
}
