package ch04.unit01;

import java.util.Scanner;

public class Quize06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		int result =0;
		char opr;
		
		System.out.print("두개의 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자 입력[+,-,*,/] ? ");
		opr = sc.next().charAt(0);
				
		if (opr == '+') {
			result = a + b;
		} else if (opr == '-') {
			result = a - b;
		} else if (opr == '*') {
			result = a * b;
		} else if (opr == '/') {
			result = a / b;
		} else {
			System.out.println("연산자 입력오류!!");
		}
		
		System.out.printf("%d %c %d = %d",a,opr,b,result);
		
		sc.close();
	}

}
