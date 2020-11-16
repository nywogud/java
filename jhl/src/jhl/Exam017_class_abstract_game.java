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
		System.out.println("현재위치에 정지한다.");
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		
		System.out.println("marine이 좌표 [x : " + x + ", y : " + y + "]으로 움직임");
		
	}
	
	void steampack() {
		System.out.println("스팀팩은 일종의 마약이다.");
	}
	
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank가 좌표 [x : " + x + ", y : " + y + "]으로 움직임");
	}
	
	void changemod() {

		System.out.println("시즈모즈로 토글링");
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("수송선은 좌표 [x : " + x + ", y : " + y + "]으로 움직임");
	}
	
	void load() {

		System.out.println("아군 병력을 싣는다.");
	}
	
	void unload() {
		System.out.println("아군 병력을 드롭.");
		}
	}

