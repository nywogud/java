�̰� �� �𸣰���.
package jhl;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex054ClassQueue2 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue�� �ִ� 5�� ������ �����ϰڴٴ� �ǹ�.
	public static void main(String[] args) {

		System.out.println("help�� �Է��ϸ� ������ �� �� ����.");

		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();

				if ("".equals(input)) continue;
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("������ ������.");
					System.out.println("q or Q key .. ���α׷� ����");
					System.out.println("history ... �ֱٿ� �Է��� ���ɾ�" + MAX_SIZE +"�� ���� ��.");
				} else if (input.equalsIgnoreCase("history")) {
					int i =0;
					save(input);

					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();

					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
				}
				else {
					save(input);
					System.out.println(input);
				}

			} catch(Exception e) {
				System.out.println("�Է� ���� �߻�");

			}
		}




	}
	public static void save(String input) {
		if (!"".equals(input)) {
			q.offer(input);

			if(q.size() > MAX_SIZE)
				q.remove();
		}

	}

}
