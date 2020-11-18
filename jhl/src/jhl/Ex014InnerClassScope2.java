package jhl;

public class Ex014InnerClassScope2 {
	class InstanceInner{}
	static class StaticInner {}
	
	// 인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	//스태틱 멤버 간에는 서로 직접 접근이 가능하다.
	StaticInner cv = new StaticInner();
	
	static void StaticMethod() {
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//방법은 있지만 굳이 권장하지 않음.
		//그리고 외부 클래스를 반드시 먼저 객체화 해야 함.
		Ex014InnerClassScope2 outer = new Ex014InnerClassScope2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj3 = new InstanceInner();
		StaticInner obj4 = new StaticInner();
		
		//메소드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod(){
		class LocalInner{}
		LocalInner lv = new LocalInner();
		
	}
}
