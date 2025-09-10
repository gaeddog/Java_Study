package ch04.unit01;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		char b;
		
		System.out.print("한문자 ? ");
		ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			b = (char)(ch + 32);
			System.out.println(ch + " => 소문자 변환 : " + b);
		} else if(ch >= 'a' && ch <= 'z') {
			b = (char)(ch - 32);
			System.out.println(ch + " => 대문자 변환 : " + b);
		} else {
			System.out.println(ch + " => 기타문자");
		}

		sc.close();

	}

}
