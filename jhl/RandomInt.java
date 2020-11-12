package jhl;

import java.util.Scanner;

public class RandomInt {
	public static void main(String[] args) {
		int randomDigit = (int) (Math.random() * 100+1);

		System.out.println();

		System.out.print("1-100까지 숫자 맞추기 :");
		Scanner sc = new Scanner(System.in);
		
		//min 값과 max 값을 주고 입력 받을 때 마다 값을 교체함

		int insertDigit = sc.nextInt();
		
		int rotation = 0;
		
		while(randomDigit!=insertDigit) {
			
			if (insertDigit > randomDigit) {
				
				System.out.println("입력한 수("+ insertDigit + ") 보다 작은 수임.");
				insertDigit = sc.nextInt();
				rotation += 1;
				
			}else if (insertDigit < randomDigit){
				
				System.out.println("입력한 수("+ insertDigit + ") 보다 큰 수임.");
				insertDigit = sc.nextInt();
				rotation += 1;
			}
		}
		
		System.out.println("정답. " + rotation + "회의 시도 끝에 성공");

	}
}
