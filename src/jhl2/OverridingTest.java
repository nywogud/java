package jhl2;

class Pointer2 extends Object{
	
	int x, y;
	
	Pointer2(){
		this(1,1);// �Ű����� �� ���� ��ü �������� �� x, y ���� 1�� �ʱ�ȭ �� ������ ������ �ִٴ� ��
	}	//�����ο� ���� ������ �����Ϸ��� �ڵ����� this(0,0)���� �ʱ�ȭ�� �ش�. ����Ʈ ������ ������ �����Ϸ��� �ڵ����� 0���� ���õ� �����ڸ� �����
		//�ش�. �� �ϳ��� �����ڶ� ������ �� ����� �ش�.
	
	Pointer2(int x, int y){ //�ٵ� �Ű����� ���� �ָ�, �ϰ� �ش޶�� ���� ���ٰ� ��� ��
		this.x = x;
		this.y = y;
	}
	
	
	
	public String toString() {//overriding
		return "x : " + x + " y : "+ y;
	}
	
}


public class OverridingTest {

	public static void main(String[] args) {
		Pointer2 p = new Pointer2();
		System.out.println(p);
	}

}
