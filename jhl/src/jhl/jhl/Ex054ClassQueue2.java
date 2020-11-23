이거 잘 모르겠음.
package jhl;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex054ClassQueue2 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue에 최대 5개 까지만 저장하겠다는 의미.
	public static void main(String[] args) {

		System.out.println("help를 입력하면 도움말을 볼 수 있음.");

		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();

				if ("".equals(input)) continue;
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("도움말을 보여줌.");
					System.out.println("q or Q key .. 프로그램 종료");
					System.out.println("history ... 최근에 입력한 명령어" + MAX_SIZE +"개 보여 줌.");
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
				System.out.println("입력 오류 발생");

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

