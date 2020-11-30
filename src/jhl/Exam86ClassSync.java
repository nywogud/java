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

class RunnableEx86 implements Runnable{//RunnableEx86Ŭ������ Runnable Ŭ������ ����.
	
//	int i = 100; //�������̽��� ������ Ŭ���� �������� �ν��Ͻ� ���� ���� ����
	
	Account acc = new Account(); // Account Ŭ������ �ν��Ͻ� �����ؼ� �ּ� ���� �������� acc�� ���� 

	public void run() {// Runnable �������̽��� �߻� �޼��带 ����
		while(acc.getBalance()>0) {
			int money = (int)(Math.random()*2 +1)*100;
			acc.deposit(money);
			System.out.println("�Ա� �� ���� �ܾ��� : " +acc.getBalance());

			money = (int)(Math.random()*3 +1)*100;
			acc.withdraw(money);
			System.out.println("��� �� ���� �ܾ��� :" + acc.getBalance());
		}
	}
}
