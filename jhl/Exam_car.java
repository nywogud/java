package jhl;

class Car {
	//instance value
	String color;
	String geartype;
	int door;
	
	Car(){
		//�̰��� default �� ������ �� ����
//		color = "white";
//		door = 4;
		this("white","auto", 4);
		
	}
	
	Car(String color, String geartype, int door){ //�Ķ���Ϳ� ���� ���� local value
		this.color = color;	
		this.geartype = geartype;
		this.door = door;
		// �Ұ�ȣ �ȿ��� instance value - instance�� ����ִ� �� ��� �����ִ� ����
	}

}


public class Exam_car {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
//		car1.color = "red";
//		car1.geartype = "auto";
//		car1.door = 4;
		
		Car car2 = new Car("white", "manual", 2);
		
		System.out.println("car1�� �Ӽ�: " + car1.color + car1.geartype + car1.door);
		System.out.println("car2�� �Ӽ�: " + car2.color + car2.geartype + car2.door);
		

	}

}
