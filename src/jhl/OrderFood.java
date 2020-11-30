package jhl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OrderFood {

	public static void main(String[] args) {
		String[] orderList = {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
		//		[alex pizza pasta, alex pizza pizza, alex noodle, bob pasta, bob noodle sandwich pasta, bob steak noodle]
		
		ArrayList orders = new ArrayList();
		for (int i=0; i<orderList.length; i++) {
			orders.add(Arrays.toString(orderList[i].split(" ")));
		}

		System.out.println(orders);
		String[] temp = new String[orders.size()];
		for(int i=0; i<orders.size(); i++) {
			temp[i] = (String) orders.get(i);
		}
		System.out.println(Arrays.toString(temp.));
		Set names = new HashSet();
		for (int i=0; i<temp.length; i++) {
			
		}
		
		
		

	}

}


