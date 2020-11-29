package jhl2;

abstract class Player2{
	abstract void play();
	abstract void stop();
}

class AudioPlayer1 extends Player2{
	void play(){System.out.println(123);}
	void stop(){System.out.println(456);}
}

public class PlayerTest {
	public static void main(String[] args) {
		Player2 p = new AudioPlayer1();
		p.play();
		p.stop();
	}
}
