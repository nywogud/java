package jhl;

public class Exam82ClassDemon {
	public static void main(String[] args) {
		ThreadEx82_1 t1 = new ThreadEx82_1();
		ThreadEx82_2 t2 = new ThreadEx82_2();
		
		t1.start();
		t2.start();
		
		try {Thread.sleep(3000);}
		catch(InterruptedException e) {}
		
		System.out.println("Main finished");
		
	}
}

///////////////////////////////////////////////

class ThreadEx82_1 extends Thread{
	public void run() {
		for (int i=0; i<500; i++)
			System.out.print("$");
			System.out.println("쓰레드1 종료");
		
	}
}


class ThreadEx82_2 extends Thread{
	public void run() {
		for (int i=0; i<500; i++)
			System.out.print("#");
			System.out.println("쓰레드2 종료");
		
	}
}
