package jhl;

import java.util.ArrayList;
import java.util.Collections;

public class TitanicEx {
	public static void main(String[] args) {


		int[] input = {86, 95, 107, 67, 38, 49, 116, 22, 78, 53};
		int n = 10;
		int maxWeight = 150;
		int cnt = 0;

		ArrayList lst = new ArrayList();

		for (int i=0; i<n; i++) {

			lst.add(input[i]);

		}

		Collections.sort(lst);

		while(lst.size()>0) {

			if (lst.size() == 1){
				cnt += 1;
				break;
			}

			if((int)lst.get(0)+(int)lst.get(lst.size()-1) > maxWeight) {

				lst.remove(lst.size()-1);
				cnt += 1;


			} else {
				//제거
				lst.remove(0);
				lst.remove(lst.size()-1);
				cnt += 1;			

			} 
		}


		System.out.println("보트 수는 : " + cnt);

	}
}
