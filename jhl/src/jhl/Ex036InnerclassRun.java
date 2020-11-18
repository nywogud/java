package jhl;

class Outer2{
	class InstanceInner{
		int iv =100;
		
	}
	
	static class StaticInner{
		int iv =200;
		static int cv = 300;
		
	}
	
	int myMethod() {
		System.out.println("myMethod ������");
		
		class LocalInner{
			int iv =400;
			
		}
		
		LocalInner li = new LocalInner();
		
		return li.iv;
	}
	
}

public class Ex036InnerclassRun {
	public static void main(String[] args) {
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();
		System.out.println(ii.iv);//100
		System.out.println(Outer2.StaticInner.cv);// ����ƽ�̶� �޸𸮿� �ٷ� �ö�. �ν��Ͻ�ȭ �ʿ� ����
		
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println(si.iv);
		
		System.out.println(oc.myMethod());
		
	}
}
