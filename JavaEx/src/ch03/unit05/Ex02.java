package ch03.unit05;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		s = a % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(a + " : " + s);
		
		sc.close();
	}
	


}
