package jhl;

class Car1{
	String color;
	String geartype;
	int door;
	
	Car1(){}
	
	Car1(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
}

public class Try {

	public static void main(String[] args) {
		
		Car1 car = new Car1("red", "auto", 4);
		
		System.out.println(car.color);
		System.out.println(car.geartype);
		System.out.println(car.door);
		

	}

}
