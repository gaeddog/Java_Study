package ch04.unit01;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("두개의 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int temp; // 스왑을 위한 변수
		
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		}
			
		System.out.println("첫번째 수 : " + a);
		System.out.println("두번째 수 : " + b);
		System.out.println("두수 차이 : " + (a-b));
		
		sc.close();
	}

}
