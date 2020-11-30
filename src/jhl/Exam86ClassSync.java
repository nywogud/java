package jhl;

public class Exam86ClassSync {
	public static void main(String[] args) {
		Runnable r = new RunnableEx86();

		Thread th1 = new Thread(r);
		th1.start();
		new Thread(r).start();
	}
}


class Account {
	private int balance = 1000;

	public synchronized int getBalance() {
		try {Thread.sleep(300);}catch(InterruptedException e) {}
		return balance;
	}

	public synchronized void withdraw(int money) {
		if(balance < money) {
			try{wait();} catch(InterruptedException e) {}

		}
		balance -= money;
	}

	public synchronized void deposit(int money) {
		if (money > 0) this.balance += money; notify();
	}

}

class RunnableEx86 implements Runnable{//RunnableEx86클래스가 Runnable 클래스를 구현.
	
//	int i = 100; //인터페이스를 구현한 클래스 내에서도 인스턴스 변수 선언 가능
	
	Account acc = new Account(); // Account 클래스의 인스턴스 생성해서 주소 값을 참조변수 acc에 저장 

	public void run() {// Runnable 인터페이스의 추상 메서드를 구현
		while(acc.getBalance()>0) {
			int money = (int)(Math.random()*2 +1)*100;
			acc.deposit(money);
			System.out.println("입금 후 현재 잔액은 : " +acc.getBalance());

			money = (int)(Math.random()*3 +1)*100;
			acc.withdraw(money);
			System.out.println("출금 후 현재 잔액은 :" + acc.getBalance());
		}
	}
}
