package jhl;

abstract class UnitAa {
	int x,y;
	
	abstract void move(int x, int y);
	void stop() {
			System.out.println("�����մϴ�.");
		}
	}

interface Fightable {
	public abstract void move(int x, int y); //public abstract�� ���� ����
	public abstract void attack(Fightable f); //public abstract�� ���� ����
}

class Fighter extends UnitAa implements Fightable{
	public void move(int x, int y) { //public �ۼ����� ������ �������̵� ��Ģ(������ �������� �ȵ�) ����
		System.out.println("[" + x + "," + y + "] ��ǥ�� �̵�");
	}
	
	public void attack(Fightable f) { //public �ۼ����� ������ �������̵� ��Ģ(������ �������� �ȵ�) ����
		//�����Ϸ��� Fightable ������ �� ������� ���
		System.out.println(f+ "�� �����϶�");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}

public class Ex30ClassFighterTest {
		public static void main(String[] args) {
//			Fighter f = new Fighter();
			//�����⸸ �ִ� �������̽��� ��ü �����
			Fightable f2 = (Fightable) new Fighter();
			f2.move(200, 200);
//			f2.stop();
			f2.attack(new Fighter());//Ŭ���� ������ ����
			
			
		}
}
