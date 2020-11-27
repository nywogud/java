package jhl;


class ThreadEx1 extends Thread {
	public void run() {
		for(int i =0; i<500; i++) {
			System.out.print("¢¾");

		}
	}
}

class ThreadEx2 implements Runnable {
	public void run() {
		for(int i =0; i<500; i++) {
			System.out.print("¢½");
		}
	}
}


public class Exam81ClassThread {
	static long startTime = 0;
	public static void main(String[] args) {


		ThreadEx1 t1 = new ThreadEx1();
		t1.start();
		//		startTime = System.currentTimeMillis();

		Runnable r = new ThreadEx2();
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();

	}
}
