
import java.util.Scanner;

public class CareCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�޸��忡 �ڼҼ� �Է��� ������ ���ڼ��� ���ϴ�.");
		System.out.println("�۾��� ������ �����Ͻð� â�� �ݾ� �ּ���.");
		
		DirectTyping.inputString(args);
		System.out.println("���ڼ��� ���� ���ϸ� press 1.");
		int res = scan.nextInt();
		if (res==1) {FileReadChar.countChar(args);}
		else {System.out.println("���� 1�� ������ �ʾƼ� ����");}
		scan.close();
		

	}

}
