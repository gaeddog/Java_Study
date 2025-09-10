package ch03.unit05;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		//정수를 입력 받아 양수인지 음수인지 0인지 출력
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		s = a > 0 ? "양수" : (a < 0 ? "음수" : "영");
		System.out.println(a + " -> " + s);
		
		sc.close();
	}

}
