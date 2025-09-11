package ch04.unit02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 입력받은 숫자가 3의 배수인지 판별
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.printf("정수 ? ");
		n = sc.nextInt();
		
		switch(n % 3) { //수식이 올 수 있다. case 다음에는 상수만 리터널만 가능
			case 0: System.out.println(n + " : 3의 배수"); break;
			case 1: 
			case 2: System.out.println(n + " : 3의 배수가 아님"); break;
		}
		
		sc.close();

	}

}
