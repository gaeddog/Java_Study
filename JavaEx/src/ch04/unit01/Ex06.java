package ch04.unit01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		// 잘못 작성한 예
		/*
		if(a % 2 == 0) {
			System.out.println(a + " : 2의 배수");
		} else if(a % 3 == 0) {
			System.out.println(a + " : 3의 배수");
		} else if(a % 2 == 0 && a % 3 == 0) {
			System.out.println(a + " : 2와 3의 배수");
		} else {
			System.out.println(a + " : 2 또는 3의 배수가 아님");
		}
		*/
		
		if(a % 2 == 0 && a % 3 == 0) {
			System.out.println(a + " : 2와 3의 배수");
		} else if(a % 2 == 0) {
			System.out.println(a + " : 2의 배수");
		} else if(a % 3 == 0) {
			System.out.println(a + " : 3의 배수");
		} else {
			System.out.println(a + " : 2 또는 3의 배수가 아님");
		}
		
		sc.close();
	
	}
}
