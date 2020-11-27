package jhl;

import javax.swing.JOptionPane;

public class Exam81CalssThread2 {
	public static void main(String[] args) {
		ThreadEx1_3 t1 = new ThreadEx1_3();
		t1.start();
		
		String input = JOptionPane.showInputDialog("입력메시지 ");
		System.out.println("입력한 메시지는 " + input + "임");
	}
}

class ThreadEx1_3 extends Thread {
	public void run() {
		for(int i =20;i>0;i--) {
			System.out.println("XXXX" +i +"XXXX");
			try {
				sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
