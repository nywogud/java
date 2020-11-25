package jhl2;

class Product {
	int price;
	int bonusPoint;

	Product(){super();}
	Product(int price){
		this.price = price;

		this.bonusPoint = (int)(price*0.1); 
	}
}

class Tv extends Product {

	String tv;

	Tv(){super(100);}

	public String toString() {return "tv";}


}

class Computer extends Product{

	String computer;

	Computer(){super(200);}

	public String toString() {return "computer";}
}

class Audio extends Product{
	String audio;

	Audio(){super(50);}

	public String toString() {return "audio";}
}

class Buyer {

	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10];
	int i = 0;
 
	Buyer(){}

	void buy(Product p) {
		if (this.money < p.price) {
			System.out.println("���� ������.");;
		}else {
			this.money -= p.price;
			this.bonusPoint += p.bonusPoint;

			System.out.println(p.toString() + " ����.");
		}
		
		cart[i++] = p; 
		
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for (int i=0; i<cart.length; i++) {
			if (cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i].toString() +", ";
		}
		
		System.out.println("�� ���űݾ� : " + sum);
		System.out.println("���� ��� : " + itemList);
		
	}
}



public class BuyProduct {
	public static void main(String[] args) {

		Buyer b = new Buyer();	
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		
		System.out.println("���� ���� ���� " + b.money);
		System.out.println("���ʽ� ����Ʈ�� " + b.bonusPoint);
		
		b.summary();

	}
}
