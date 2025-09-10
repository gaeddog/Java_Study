package ch03.unit03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		System.out.printf("정수 ? ");
		a = sc.nextInt();
		
		s = (a & 1) == 0 ? "짝수" : "홀수";
		// &와 == 중에 ==이 높음
		 // 13 : 1011
		 //  1 : 0001
		 //      0000
		System.out.println(a+ "-->" + s);
		
		sc.close();

	}

}
