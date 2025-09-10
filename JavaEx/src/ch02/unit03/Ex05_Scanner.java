package ch02.unit03;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("두정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		
		sc.close();
				
	}

}
