package jhl;

public class Ex014InnerClassScope2 {
	class InstanceInner{}
	static class StaticInner {}
	
	// �ν��Ͻ� ��� ������ ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	//����ƽ ��� ������ ���� ���� ������ �����ϴ�.
	StaticInner cv = new StaticInner();
	
	static void StaticMethod() {
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//����� ������ ���� �������� ����.
		//�׸��� �ܺ� Ŭ������ �ݵ�� ���� ��üȭ �ؾ� ��.
		Ex014InnerClassScope2 outer = new Ex014InnerClassScope2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj3 = new InstanceInner();
		StaticInner obj4 = new StaticInner();
		
		//�޼ҵ� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ �� ����.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod(){
		class LocalInner{}
		LocalInner lv = new LocalInner();
		
	}
}
