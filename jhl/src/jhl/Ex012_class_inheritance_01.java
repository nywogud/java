package jhl;

class Point extends Object {
	int x;
	int y;

	Point(){}//default 积己磊
	Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}

}

//惑加包拌
class Circle extends Point{
	int r;
	
	Circle (){}//default 积己磊
	Circle(int x, int y, int r){
		super(x,y);
		this.r = r;
	}
	
}

//class Circle{
//	Point p = new Point();
//	int r;
//	
//}



public class Ex012_class_inheritance_01 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.x=10;
		c.y=10;
		c.r=10;
		System.out.println("c.p.x : " + c.x);
		System.out.println("c.p.y : " + c.y);
		System.out.println("c.r : " + c.r);
	}

}
