package ch03.unit01;

import java.util.Scanner;

/*
 * 섭씨온도를 입력받아 화씨온도로 변환한다.
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c;    // 섭씨를 입력받아 저장
		double f; // 화씨로 변환하여 저장
		
		System.out.print("섭씨 온도 ? ");
		c = sc.nextInt();
		
		f = c * 1.8 + 32;
		
		System.out.printf("화씨 온도 : %.1f", f);
		sc.close();

	}
}
