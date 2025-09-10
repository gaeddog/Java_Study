package ch03.unit05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a, b;
		
		//한문자를 입력 받아 소문자는 대문자로 대문자는 소문자로 출력하며
		//입력받은 문자가 영문자가 아니면 그대로 출력
		
		System.out.print("한문자 ? ");
		a = sc.next().charAt(0);
        
		// A:65 a:97	    	
		b =  a >= 'A' && a <= 'Z' ? (char)(a + 32) : (a >= 'a' && a <= 'z' ? (char)(a - 32) : a);

		System.out.println(a + " -> " + b);
		
		sc.close();
	}
}
