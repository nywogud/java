package jhl;

import javax.swing.JOptionPane;

public class Exam83ClassDemon1 {
	public static void main(String[] args) {
		ThreadEx83_1 t1 = new ThreadEx83_1();

		t1.start();
		String input = JOptionPane.showInputDialog("�Է��ϼ���..");
		System.out.println();
		System.out.println(input);


		t1.interrupt();
		System.out.println("t1.isInterrupted()�� ������ �ƴ���..."+ t1.isInterrupted());

	}
}


class ThreadEx83_1 extends Thread{
	public void run() {
		int i =10;

		while(i !=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<100000000L; x++);
		}
		System.out.println("ī��Ʈ�ٿ� ����");
	}
}