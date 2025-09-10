package ch02.unit04;

import java.util.Scanner;

/*
 * 정수를 입력 받아 입력 받은 정수에 해당하는 문자 출력
 */

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int code;
		
		System.out.print("문자코드 ? ");
		code = sc.nextInt();
		
		System.out.printf("문자출력 : %c", code);
		
		sc.close();
	}
}
