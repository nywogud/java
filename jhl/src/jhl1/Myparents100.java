package jhl1;

public class Myparents100 {
	private   int prv; // $같은 클래스에서만 접근$, 가장 좁은 법위를 갖는다. 메소드로 접근해야 함.
			  int def; // default 제어자는 같은 패키지에서만 접근, default 제어자는 생략가능
	protected int prt; // 다른 패키지에 있는 상속 받은 자손이 활용할 수 있음.
	public    int pub; // 모두 사용 가능

	public void printmembers() {
		System.out.println(prv);
		System.out.println(def);
		System.out.println(prt);
		System.out.println(pub);
	}
}
