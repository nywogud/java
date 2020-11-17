package jhl;

abstract class UnitAa {
	int x,y;
	
	abstract void move(int x, int y);
	void stop() {
			System.out.println("정지합니다.");
		}
	}

interface Fightable {
	public abstract void move(int x, int y); //public abstract는 생략 가능
	public abstract void attack(Fightable f); //public abstract는 생략 가능
}

class Fighter extends UnitAa implements Fightable{
	public void move(int x, int y) { //public 작성하지 않으면 오버라이딩 규칙(범위가 좁아지면 안됨) 위반
		System.out.println("[" + x + "," + y + "] 좌표로 이동");
	}
	
	public void attack(Fightable f) { //public 작성하지 않으면 오버라이딩 규칙(범위가 좁아지면 안됨) 위반
		//공격하려면 Fightable 구현한 놈만 들어오라는 얘기
		System.out.println(f+ "를 공격하라");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}

public class Ex30ClassFighterTest {
		public static void main(String[] args) {
//			Fighter f = new Fighter();
			//껍떼기만 있는 인터페이스로 객체 만들기
			Fightable f2 = (Fightable) new Fighter();
			f2.move(200, 200);
//			f2.stop();
			f2.attack(new Fighter());//클래스 다형성 지원
			
			
		}
}
