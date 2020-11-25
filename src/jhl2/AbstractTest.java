package jhl2;

abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos + " ��ġ���� �÷���");}
	void stop() {System.out.println("����.");}
	}

public class AbstractTest {
	public static void main(String[] args) {
		Player a = new AudioPlayer();
		a.play(100);
		a.stop();
	}
}
