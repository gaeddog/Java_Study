package ch04.unit01;

import java.util.Scanner;

public class Ex01_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		b = 0;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
//		컴오류 : b롤 초기화 하지 않아서
//		if (a < 0) {
//			b = -a;
//		}
//			
//        System.out.println(a + " -> " + b);
		
		b = a;
		if (a < 0) {
			b = -a;
		}
		
		System.out.println(a + " -> " + b);		
        sc.close();
	}

}
