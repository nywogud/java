package jhl;

abstract class Player{ //�߻� Ŭ������ �߻� �޼ҵ尡 �Ѱ��� �־�� ��.
	abstract void play(int pos);// ����θ� �ְ� ����(������)�� ���� ���� �߻� �޼ҵ�
	abstract void stop();
	
}

//�߻� Ŭ������ ����� ���ؼ� �׸��� �޼ҵ尡 �ϼ��ž� ��ü�� �� �ν��Ͻ�ȭ�� �ȴ�.
class Audio_player extends Player{
	void play(int pos) {
		System.out.println(pos + "�������κ��� �÷�����.");
		}
	void stop() {System.out.println("��� ����");} 
}


public class Exam018_class_polymolphism {

	public static void main(String[] args) {
		
//		Player p = new Player(); //�߻� Ŭ������ �ν��Ͻ�ȭ �� �� ����.
//		Audio_player ap = new Audio_player();
		
		Player ap = new Audio_player();//������ ����. �� Player�� �߻�ȭ Ŭ���������� ����� ���� �ν��Ͻ��� ������ �� ����. 
		ap.play(100);
		ap.stop();
		
			
		
	}

}
