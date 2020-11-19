package jhl2;

class Pointer{
	int x,y;

	Pointer(){}
}

class Circle {
	Circle(){}
	Pointer p = new Pointer();
	int r;
}

public class inheritance {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.p.x = 2;
		c.p.y = 3;
		c.r = 4;
		
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
		
		
		
	}

}
