package jhl;

public class Ex036InnerclassModifier {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv =outerIv;
		int iiv2 = outerCv;
		
	}
	
	static class staticInner{
//		int siv = outerIv; //�� ����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ��� ������ �� ����.
		static int scv = outerCv;
		
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class Localinner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; //��Ģ�� �����ε� JDK 1.8���ʹ� ������ �ƴ�. �� ����� ������.
			int liv4 = LV; //ok
		}
	}
}
