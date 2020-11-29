package jhl2;

interface Repairable{}
interface Cureable{}
class Unit1{

	int x;
	int y;

	Unit1(){}

	Unit1(int x, int y){
		this.x = x;
		this.y =y;
	}

	void move(Unit1 u) {
		System.out.println(u.toString() + "��(��) x��ǥ : " + this.x + "  y��ǥ : " + this.y + "�� �̵�");
	}

	void stop() {
		System.out.println("����");
	}

	void attack() {
		System.out.println("����");
	}

}

class GroundUnit extends Unit1{GroundUnit(){};}
class AirUnit extends Unit1{AirUnit(){};}

class Marine1 extends GroundUnit implements Cureable{
	
	public String toString() {
		return "Marine";
	}
}

class Madic extends GroundUnit implements Cureable{
	
	public void cure(Cureable c) {
		
		System.out.println("�ŵ��� " + c.toString() + "��(��) ġ������.");
	}
	
	public String toString() {
		return "madic";
	}
}

class Tank extends GroundUnit implements Repairable {int gage; Tank(){}
public String toString() {
	return "Tank";				
}
}
class Scv extends GroundUnit implements Repairable {int gage; Scv(){}
public void repair(Repairable r) {
	System.out.println("SCV�� " + r.toString() + "��(��) ��������.");
}

public String toString() {
	return "SCV";
}

}
class BattleCr extends AirUnit implements Repairable {
	int gage; 
	BattleCr(){}
	public String toString() {
		return "BattleCr";
	}
}


public class StarC {
	public static void main(String[] args) {
		Marine1 marine = new Marine1();
		Tank tank = new Tank();
		BattleCr bc = new BattleCr();
		Scv scv = new Scv();
		Madic madic = new Madic();
		
		marine.x = 100;
		marine.y = 100;
		
		marine.move(marine);
		
		tank.x = 150;
		tank.y = 150;
		
		tank.move(tank);
		
		bc.x = 200;
		bc.y = 200;
		
		bc.move(bc);
		
		madic.x = 400;
		madic.y = 400;
		
		madic.move(madic);
		madic.cure(marine);
		
		scv.x = 200;
		scv.y = 200;
		
		scv.move(scv);
		scv.repair(bc);;
	}
}
