package jhl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class OrderFood {

	public static void main(String[] args) {
		
		// 내가 짠 것////////////////////////////////////////////////////////
		//		String[] orderList = {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
		//		//		[alex pizza pasta, alex pizza pizza, alex noodle, bob pasta, bob noodle sandwich pasta, bob steak noodle]
		//		
		//		ArrayList orders = new ArrayList();
		//		for (int i=0; i<orderList.length; i++) {
		//			orders.add(Arrays.toString(orderList[i].split(" ")));
		//		}
		//
		//		System.out.println(orders);
		//		String[] temp = new String[orders.size()];
		//		for(int i=0; i<orders.size(); i++) {
		//			temp[i] = (String) orders.get(i);
		//		}
		////		System.out.println(Arrays.toString(temp.));
		////		Set names = new HashSet();
		////		for (int i=0; i<temp.length; i++) {
		////			
		////		}
		//		
		///////////////////////////////////////////////////////////////////	
		
		List<String> orders = new ArrayList<String>() {
			{
				add("alex pizza pasta steak");
				add("bob noodle snadwhich pasta");
				add("choi pizza snadwhich pizza");
				add("alex pizza pasta steak");
			}
		};
		System.out.println(orders);

		//처음에 필요한 객체를 모두 생성함, 지네릭으로 타입 설정
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> menuList = new ArrayList<String>();
		ArrayList<Integer> menuCntList = new ArrayList<Integer>();
		HashMap<String, Integer> nameMenu = new HashMap<String, Integer>();

		for (String xx : orders) {//하나씩 던지는 문법
			String[] name = xx.split(" ");
			if(! nameList.contains(name[0])) { //이름 중복 제거
				nameList.add(name[0]);
			}
		}

		System.out.println(nameList);

		for (String name : nameList) {//하나씩 던지는 문법
			for(String xx : orders) {
				String[] order = xx.split(" ");
				if (name.equals(order[0])) {
					for(int j=1; j<order.length;j++) {
						if(!menuList.contains(order[j])) {//메뉴 중복 제거
							menuList.add(order[j]);
						}
					}
				}

			}
			System.out.println(name + " : " + menuList);
			nameMenu.put(name, menuList.size()); //파이썬의 len과 같은 역할 size()
			menuCntList.add(menuList.size());
			menuList.clear();

		}
		System.out.println(nameMenu);
		System.out.println(menuCntList);
		Collections.sort(menuCntList);
		int topCnt = menuCntList.get(menuCntList.size()-1);

		for (String name : nameMenu.keySet()) {
			if(nameMenu.get(name) == topCnt) {
				System.out.println(name);
			}
		}
	}

}


