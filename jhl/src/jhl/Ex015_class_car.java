package jhl;


class CAR{
	String color;
	int door;
	
	void drive(){
		System.out.println("��������");
	}
	
	void stop(){
		System.out.println("����");
	}

}

class Fire_engine_class extends CAR{
	void water() {
		System.out.println("���� �Ѹ�");
	}
}



public class Ex015_class_car {
	public static void main(String[] args) {
		CAR car = null;
		Fire_engine_class fe = new Fire_engine_class();
		Fire_engine_class fe2 = null;
		
		fe.water();
		car = (CAR) fe; //(CAR) ����ȯ�� ������. ���������� ���� : ������ �������� ����
		car.drive();
		
		fe2 = (Fire_engine_class) car;
		fe2.water();
		
		
	}
}