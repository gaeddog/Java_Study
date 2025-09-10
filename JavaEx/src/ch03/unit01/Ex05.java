package ch03.unit01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		// 일의 자리 반올림
		// 3458 = 3460
		// 3453 = 3450
		
		b = (a + 5) / 10 * 10;
		System.out.println("반올림결과 : " + b);
		
		// 일의 자리 버림
		b = a / 10 * 10;
		System.out.println("버림결과 : " + b);
		
		
		sc.close();

	}

}
