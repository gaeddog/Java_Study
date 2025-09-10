package ch02.unit03;

import java.util.Scanner;

public class Ex04_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		long age;
		double height;
		char gender;
		
		System.out.print("이름 ? ");
		name = sc.next(); //공백없는 문자열
		
		System.out.print("나이 ? ");
		age = sc.nextLong(); // 정수 입력
		
		System.out.print("키 ? ");
		height = sc.nextDouble();
		
		System.out.print("성별[M/F] ? ");
		gender = sc.next().charAt(0); //문자열을 입력 받아 앞 한글자만 추출
		
		System.out.println("이름 :" + name );
		System.out.println("나이 :" + age);
		System.out.println("키 :" + height);
		System.out.println("성별 :" + gender);
		
		sc.close();
	}

}
