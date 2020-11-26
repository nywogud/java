package jhl2;

class A{
	void method(I i) {
		i.method();
	}
}

interface I {
	public abstract void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼ҵ�");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼ҵ�");
	}
}



public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.method(new C());
	}
}
