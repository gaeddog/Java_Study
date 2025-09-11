package ch04.unit02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		// 과목 코드를 입력 받아 과목명 입력
		// j1:자바 j2:오라클 j3:스프링
		
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		
		System.out.printf("과목코드 ? ");
		s1 = sc.next();
		
		// case안에서 equls를 사용안해도 비교 가능함
		switch(s1) { 
			case "j1": s2 = "자바"; break;
			case "j2": s2 = "오라클"; break;
			case "j3": s2 = "스프링"; break;
			default: s2 = "입력 오류"; break;
		}
		
		// if(s1 == "j1") 문자열은 ==으로 비교불가
		
		System.out.println(s2);
		
		sc.close();
	}
}
