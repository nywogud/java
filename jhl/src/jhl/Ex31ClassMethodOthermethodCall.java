package jhl;

class AA{
	public void method(I i) { 
		i.method();	
	}
}

interface I {
	public void method();
}
 

class BB implements I {
	public void method() {
		System.out.println("BB클래스의 메소드 호출");
	}
}

class CC implements I {
	public void method() {
		System.out.println("CC클래스의 메소드 호출");
	}

}

public class Ex31ClassMethodOthermethodCall {
	public static void main(String[] args) {
		AA aa = new AA();
		I i = new CC();
		aa.method(i);
	}
}
