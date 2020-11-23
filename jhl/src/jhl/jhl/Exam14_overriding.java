package jhl;

class Point1 {
	int x;
	int y;
//	String getLocation() {
//		return "x : " + x +", y : " + y;
//	}
	
	public String toString() {
		return "x : " + x +", y : " + y;
	}
}

class Point3d extends Point1{
	int z;
	String getLocation() {
		return "x : " + x +", y : " + y + ", z : " + z;
	}
}

public class Exam14_overriding {
	public static void main(String[] args) {
		Point1 p = new Point1();
		Point3d p3 = new Point3d();
		
		p.x = 100;
		p.y = 200;
		
		p3.x = 10;
		p3.y = 20;
		p3.z = 30;
		
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p3.getLocation());
		
	}
}
