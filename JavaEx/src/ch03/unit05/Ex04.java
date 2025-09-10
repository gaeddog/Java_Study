package ch03.unit05;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		
		//정수를 입력 받아 양수인지 음수인지 0인지 출력
		
		System.out.print("두 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//a~b 사이에 정수의 개수는 
		c = a > b ? a - b + 1 : b - a + 1;
		System.out.println(a + " -> " + c);
		
		sc.close();
	}
}
