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
		System.out.println("BBŬ������ �޼ҵ� ȣ��");
	}
}

class CC implements I {
	public void method() {
		System.out.println("CCŬ������ �޼ҵ� ȣ��");
	}

}

public class Ex31ClassMethodOthermethodCall {
	public static void main(String[] args) {
		AA aa = new AA();
		I i = new CC();
		aa.method(i);
	}
}
