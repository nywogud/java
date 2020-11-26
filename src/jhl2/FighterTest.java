package jhl2;

class Unit {
	int x;
	int y;

	Unit(){super();}

	Unit(int x, int y){
		this.x = x;
		this.y = y;
	}

	void move() {
		System.out.printf("x��ǥ�� %d, y��ǥ�� %d��ŭ �̵���", this.x, this.y);
	}

	void stop() {
		System.out.println("stop");
	}

}

interface Attack{
	public abstract void fight(Attack a);

}

class Marine extends Unit implements Attack{
	public void fight(Attack a) {
		System.out.println("Attack");
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Marine m = new Marine();
		m.x = 100;
		m.y = 70;
		m.move();
		System.out.println();
		m.fight(m);
	}
}
