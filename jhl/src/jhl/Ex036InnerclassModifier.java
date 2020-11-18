package jhl;

public class Ex036InnerclassModifier {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv =outerIv;
		int iiv2 = outerCv;
		
	}
	
	static class staticInner{
//		int siv = outerIv; //즉 스태틱 클래스는 외부 클래스의 인스턴스에 접근할 수 없다.
		static int scv = outerCv;
		
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class Localinner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; //원칙은 에러인데 JDK 1.8부터는 에러가 아님. 단 상수로 인정함.
			int liv4 = LV; //ok
		}
	}
}
