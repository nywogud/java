package jhl;

class Product1{
	int price; //제품의 가격
	int bonus_point;//제품 구매 시 돌려줄 보너스 포인트
	
	Product1(){}
	
	Product1 (int price){
		this.price = price;
		this.bonus_point = (int) (price/10.0); //보너스 포인트는 제품 가격의 10%
		
	}
	
}

class Tv1 extends Product1{
	Tv1(){
		super(100); //조상의 생성자, 즉 Product(int price)를 호출하겠다는 의미
	}
	
	public String tostring() {
		return "TV 구입";
		}
}
	

class Computer extends Product1{
	Computer(){
		super(200); //조상의 생성자, 즉 Product(int price)를 호출하겠다는 의미
	}
	
	public String tostring() {
		return "COMPUTER 구입";
	}
	
	
}

class Audio extends Product1{
	Audio(){
		super(50);
	}
	
	public String tostring() {
		return "Audio 구입";
	}
	
}

class Buyer{
	int money = 1000;
	int bonus_point = 0;
	
	Product1[] cart = new Product1[20]; //바이어가 구입한 제품을 저장하기 위해서 만든 배열
	
	int i = 0;
	
	
	void buy(Product1 p) {
		if (money < p.price) {
			System.out.println("잔액 부족. 충전하삼");
			return;
		} 
		
		money -= p.price;
		bonus_point += p.bonus_point;
		cart[i++] = p;
		System.out.println(p.toString() + "을 했음.");
	}
	
	void show_cart() {
		int sum=0;
		String item_list = "";
		
		for (int i=0; i<cart.length; i++) {
			if (cart[i]==null) break;
			sum += cart[i].price;
			item_list+=cart[i] + ", ";
			
		}
		System.out.println(" 구입한 제품의 총합은 " + sum + "만원입니다.");
		System.out.println("구입한 제품은 " + cart);
	}
}


public class Exam015_class_ploymophism01 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		Product1[] p = new Product1[3];
		
		p[0] = new Tv1();
		p[1] = new Computer();
		p[2] = new Audio();
		
		for (int i=0; i <p.length; i++) {
			b.buy(p[i]);
			
		}
		
		b.show_cart();
		
		
//		b.buy(new Tv1());
//		b.buy(new Computer());
//		b.buy(new Audio());
		
		System.out.println("현재 지갑에 남은 돈은 " + b.money + "원임");
		System.out.println("보너스 포인트는 "+ b.bonus_point + "임");
	}

}

// 왜 이렇게 나올까.....

//jhl.Tv1@73a28541을 했음.
//jhl.Computer@69222c14을 했음.
//jhl.Audio@782830e을 했음.
//현재 지갑에 남은 돈은 650원임
//보너스 포인트는 35임
