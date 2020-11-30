package jhl;

public class Exam85ClassThreadDeprecated {
	public static void main(String[] args) {
		RunImpExam85 r = new RunImpExam85();
		
		ThreadEx85 th4 = new ThreadEx85();

		JhThread th1 = new JhThread("Thread1#1");
		JhThread th2 = new JhThread("Thread2##22");
		JhThread th3 = new JhThread("Thread3###333");
		
		th4.start();
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch(InterruptedException e) {}

	}
}

class JhThread implements Runnable {
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	JhThread(String name) {
		th = new Thread(this, name);//
	}
	
	void start() {
		th.start();
	}
	
	void resume() {
		suspended = false;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void stop() {
		stopped = true;
		th.interrupt();
	}
	
	
	public void run() {
		while(!stopped) 
			if (! suspended){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e){}
		}else {
			Thread.yield();
		}
	}
}

class ThreadEx85 extends Thread{
	public void run() {
		int i =10;
		while(i!=0) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
		
		System.out.println("카운드 다운 종료");
	}
}
