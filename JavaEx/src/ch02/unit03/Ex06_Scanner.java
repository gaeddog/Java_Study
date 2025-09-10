package ch02.unit03;

import java.util.Scanner;

public class Ex06_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String birth, tel;
		
		System.out.print("이름 ? ");
		name = sc.nextLine(); //공백없는 문자열
		
		System.out.print("나이 ? ");
		age = sc.nextInt(); // 정수 입력
		
		sc.nextLine(); //엔터를 버림
		
		System.out.print("생년월일 ? ");
		birth = sc.nextLine(); //공백없는 문자열
		
		System.out.print("전화번호 ? ");
		tel = sc.nextLine(); //공백없는 문자열
		
		System.out.println("이름 :" + name );
		System.out.println("나이 :" + age);
		System.out.println("생년월일 :" + birth);
		System.out.println("전화번호 :" + tel);

		sc.close();

	}

}
