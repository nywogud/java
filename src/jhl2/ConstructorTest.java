package jhl2;

class Paren {
	int x, y;
	
	Paren(){
		this(0,0); //����Ʈ �������� ����Ʈ ��
	}
	
	Paren(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}

class Child extends Paren{
	
	int z;
	
	Child(int x, int y, int z){
		
		super(x, y);
		this.z = z;
	}
	
	void print() {
		System.out.println("super.x : "+ super.x + " super.y : "+ super.y
				+ " this.z : "+ this.z); 
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Child c = new Child(1,2,3);
		c.print();
	}
}
