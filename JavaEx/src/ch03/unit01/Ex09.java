package ch03.unit01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w,h;
		int a,b;
		
		//가로와 세로의 길이를 입력 받아 직사각형의 넓이와 둘레를 구하기
		
		System.out.print("가로 ? ");
		w = sc.nextInt();
		
		System.out.print("세로 ? ");
		h = sc.nextInt();
		
		a = w*h;
		b = (w+h)*2;
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
		
		sc.close();

	}

}
