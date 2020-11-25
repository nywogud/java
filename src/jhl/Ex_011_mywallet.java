package jhl;

class Mywallet {

	//iv 선언부
	String name;
	int age;
	String address;
	private int wallet;

	//생성자 선언
	public Mywallet() {}

	public Mywallet(String name, int age, String address, int wallet ) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.wallet = wallet;

	}

	void show_mywallet() {
		System.out.println("Mywallet : "+ wallet);
	}

	void pay_wallet(int cost) {
		wallet = wallet - cost;
	}


}

public class Ex_011_mywallet {

	public static void main(String[] args) {
		
		
		
		Mywallet ann = new Mywallet("jhl", 20, "seoul", 10000);//인스턴스 생성하면서 값 생성
		
		System.out.println(ann.name);
		System.out.println(ann.age);
		System.out.println(ann.address);
		
		//private은 함수로 접근
		ann.pay_wallet(1000);
		ann.show_mywallet();
		
		
		
	}

}
