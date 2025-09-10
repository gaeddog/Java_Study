package ch03.unit01;

import java.util.Scanner;

/*
 * -초를 입력 받아 시분초로 변환하는 프로그램
 * 3780을 입력했을때 몇시간 몇초인지 계산
 * 
 */
public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,h,m,s;
		
		System.out.print("초를 입력하세요 ? ");
		a = sc.nextInt();
		
		h = a / 3600;
		m = (a % 3600) / 60;
		s = a % 60;
		
		System.out.println();
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다\n.", a, h, m, s);
		
		sc.close();

	}

}
