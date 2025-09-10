package ch03.unit01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		
		System.out.print("실수 ? ");
		a = sc.nextDouble();
		
		// 소수점 셋째 자리 버림
		// 67.4567 -> 67.45
		// 67.4567 -? 6745.67
		b = (long)(a * 100) / 100.;
		System.out.println("결과 : " + b);
		
		sc.close();

	}

}
