package jhl;


class CAR{
	String color;
	int door;
	
	void drive(){
		System.out.println("운전시작");
	}
	
	void stop(){
		System.out.println("멈춤");
	}

}

class Fire_engine_class extends CAR{
	void water() {
		System.out.println("물을 뿌림");
	}
}



public class Ex015_class_car {
	public static void main(String[] args) {
		CAR car = null;
		Fire_engine_class fe = new Fire_engine_class();
		Fire_engine_class fe2 = null;
		
		fe.water();
		car = (CAR) fe; //(CAR) 형변환이 생략됨. 생략가능한 이유 : 왼편이 오른편의 조상
		car.drive();
		
		fe2 = (Fire_engine_class) car;
		fe2.water();
		
		
	}
}