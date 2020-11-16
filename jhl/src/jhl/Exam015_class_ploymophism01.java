package jhl;

class Product1{
	int price; //��ǰ�� ����
	int bonus_point;//��ǰ ���� �� ������ ���ʽ� ����Ʈ
	
	Product1(){}
	
	Product1 (int price){
		this.price = price;
		this.bonus_point = (int) (price/10.0); //���ʽ� ����Ʈ�� ��ǰ ������ 10%
		
	}
	
}

class Tv1 extends Product1{
	Tv1(){
		super(100); //������ ������, �� Product(int price)�� ȣ���ϰڴٴ� �ǹ�
	}
	
	public String tostring() {
		return "TV ����";
		}
}
	

class Computer extends Product1{
	Computer(){
		super(200); //������ ������, �� Product(int price)�� ȣ���ϰڴٴ� �ǹ�
	}
	
	public String tostring() {
		return "COMPUTER ����";
	}
	
	
}

class Audio extends Product1{
	Audio(){
		super(50);
	}
	
	public String tostring() {
		return "Audio ����";
	}
	
}

class Buyer{
	int money = 1000;
	int bonus_point = 0;
	
	Product1[] cart = new Product1[20]; //���̾ ������ ��ǰ�� �����ϱ� ���ؼ� ���� �迭
	
	int i = 0;
	
	
	void buy(Product1 p) {
		if (money < p.price) {
			System.out.println("�ܾ� ����. �����ϻ�");
			return;
		} 
		
		money -= p.price;
		bonus_point += p.bonus_point;
		cart[i++] = p;
		System.out.println(p.toString() + "�� ����.");
	}
	
	void show_cart() {
		int sum=0;
		String item_list = "";
		
		for (int i=0; i<cart.length; i++) {
			if (cart[i]==null) break;
			sum += cart[i].price;
			item_list+=cart[i] + ", ";
			
		}
		System.out.println(" ������ ��ǰ�� ������ " + sum + "�����Դϴ�.");
		System.out.println("������ ��ǰ�� " + cart);
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
		
		System.out.println("���� ������ ���� ���� " + b.money + "����");
		System.out.println("���ʽ� ����Ʈ�� "+ b.bonus_point + "��");
	}

}

// �� �̷��� ���ñ�.....

//jhl.Tv1@73a28541�� ����.
//jhl.Computer@69222c14�� ����.
//jhl.Audio@782830e�� ����.
//���� ������ ���� ���� 650����
//���ʽ� ����Ʈ�� 35��
