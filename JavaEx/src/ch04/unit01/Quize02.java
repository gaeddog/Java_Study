package ch04.unit01;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		String s;
		
		System.out.print("년도 입력 ? ");
		year = sc.nextInt();
		
		/*
		 * 윤년 기본적으로 4의 배수이지만 100배수는 아니어야한다.
		 * 단 예외적으로 400의 배수는 윤년으로 인정한다.
		 */
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			s = "윤년";
		} else {
			s = "평년";
		}
		
		System.out.println(year + "년도는 " + s + "입니다." );
		
		sc.close();

	}

}
