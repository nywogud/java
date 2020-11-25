package jhl;

abstract class Player{ //추상 클래스는 추상 메소드가 한개라도 있어야 함.
	abstract void play(int pos);// 선언부만 있고 몸통(구현부)가 없는 것이 추상 메소드
	abstract void stop();
	
}

//추상 클래스는 상속을 통해서 그리고 메소드가 완성돼야 객체가 즉 인스턴스화가 된다.
class Audio_player extends Player{
	void play(int pos) {
		System.out.println(pos + "지점으로부터 플레이함.");
		}
	void stop() {System.out.println("재생 정지");} 
}


public class Exam018_class_polymolphism {

	public static void main(String[] args) {
		
//		Player p = new Player(); //추상 클래스는 인스턴스화 할 수 없다.
//		Audio_player ap = new Audio_player();
		
		Player ap = new Audio_player();//다형성 지원. 즉 Player는 추상화 클래스였지만 상속을 통해 인스턴스를 정의할 수 있음. 
		ap.play(100);
		ap.stop();
		
			
		
	}

}
