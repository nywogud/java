package jhl;

import java.util.ArrayList;
import java.util.List;

class bag {

	//instance values 
	List <String> contents = new ArrayList();

	bag(){};

	void bag_pack(String stuff){
		contents.add(stuff);
		return;
	}

}

public class Ex6_bag {
	public static void main(String[] args) {
		bag jason = new bag();
		bag john = new bag();
		
		jason.bag_pack("books");
		jason.bag_pack("mobile_phone");
		jason.bag_pack("wallet");
		jason.bag_pack("keys");
		
		john.bag_pack("chips");
		john.bag_pack("rap-top");
		john.bag_pack("credit_card");
		john.bag_pack("pen");
		
		System.out.println("jason\'s bag : " + jason.contents);
		System.out.println("john\'s bag : " + john.contents);

	}
}
