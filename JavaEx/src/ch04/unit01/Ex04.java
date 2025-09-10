package ch04.unit01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("세개의 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// 적은수에서 큰수 순으로 출력
		// 세계의 정수 10 7 8
		// 결과 7 8 10
		
		int t;
		
		if(a > b) {
			t = a; a = b; b = t;
		}
		
		if(a > c) {
			t = a; a = c; b = t;
		}
		
		if(b > c) {
			t = b; b = c; c = t;
		}
		
		System.out.println(a + ", " + b + ", " + c);
		
		
		sc.close();

	}

}
