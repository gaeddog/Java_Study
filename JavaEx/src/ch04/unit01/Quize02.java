package ch04.unit01;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("년도 입력 ? ");
		a = sc.nextInt();
		
		if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println(a + "년도는 윤년입니다.");
		}
		
		sc.close();

	}

}
