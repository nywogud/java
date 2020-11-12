package jhl;

class Car {
	//instance value
	String color;
	String geartype;
	int door;
	
	Car(){
		//이곳에 default 값 설정할 수 있음
//		color = "white";
//		door = 4;
		this("white","auto", 4);
		
	}
	
	Car(String color, String geartype, int door){ //파라미터에 들어가는 값은 local value
		this.color = color;	
		this.geartype = geartype;
		this.door = door;
		// 소괄호 안에는 instance value - instance가 살아있는 한 계속 남아있는 변수
	}

}


public class Exam_car {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
//		car1.color = "red";
//		car1.geartype = "auto";
//		car1.door = 4;
		
		Car car2 = new Car("white", "manual", 2);
		
		System.out.println("car1의 속성: " + car1.color + car1.geartype + car1.door);
		System.out.println("car2의 속성: " + car2.color + car2.geartype + car2.door);
		

	}

}
