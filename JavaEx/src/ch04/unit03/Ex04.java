package ch04.unit03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, n;
		
		System.out.print("정수 ?");
		num = sc.nextInt();
		
		//1부터 입력받은 수 까지 홀수 출력하기
		n = 1;
		while(n <= num) {
			System.out.printf("%d ", n);
			n += 2;
		}
		
		sc.close();
	}
}

