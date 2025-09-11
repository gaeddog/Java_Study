package ch04.unit02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.printf("정수 ? ");
		n = sc.nextInt();
		
		// default : case문을 만족하는 case가 없는 경우 실행, 위치는 상관없음
		switch(n) { //수식이 올 수 있다. case 다음에는 상수만 리터널만 가능
			case 3: System.out.println("***"); break;
			case 2: System.out.println("**"); break;
			case 1: System.out.println("*"); break;
			default: System.out.println("입력 에러"); break;
		}
		
		sc.close();

	}

}
