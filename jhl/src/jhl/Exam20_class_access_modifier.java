package jhl;

import jhl1.Myparents100;

class Mychild extends Myparents100 {
	
	public void printmembers() {
		System.out.println(prv);
		System.out.println(def);
		System.out.println(prt);
		System.out.println(pub);
	}
	
	
	
}


public class Exam20_class_access_modifier {

	public static void main(String[] args) {
		Myparents100 p = new Myparents100();
		
		System.out.println(p.prv);
		System.out.println(p.def);
		System.out.println(p.prt);
		System.out.println(p.pub);
		

	}

}
