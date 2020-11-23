package jhl;

public class Exam017_class_abstract_game {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(),new Dropship()};
		
		for (int i=0; i< group.length; i++) {
			
			group[i].move(500, 500);
		}
		
	}
}

abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("������ġ�� �����Ѵ�.");
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		
		System.out.println("marine�� ��ǥ [x : " + x + ", y : " + y + "]���� ������");
		
	}
	
	void steampack() {
		System.out.println("�������� ������ �����̴�.");
	}
	
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank�� ��ǥ [x : " + x + ", y : " + y + "]���� ������");
	}
	
	void changemod() {

		System.out.println("�������� ��۸�");
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("���ۼ��� ��ǥ [x : " + x + ", y : " + y + "]���� ������");
	}
	
	void load() {

		System.out.println("�Ʊ� ������ �ƴ´�.");
	}
	
	void unload() {
		System.out.println("�Ʊ� ������ ���.");
		}
	}

