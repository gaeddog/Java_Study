package ch04.unit03;

import java.util.Scanner;

/**
 * 문제1] 정수를 입력받아 1부터 입력받은 수까지 합, 짝수 합, 홀수 합을 구하는 
 * 프로그램을 작성하시오
 *
 * [처리조건]
 * ・ 합은 while(조건)문을 이용한다.
 * ・ 정수 입력은 Scanner의 nextInt() 메소드를 이용한다.
 *
 * [실행결과]
 * 수 ? 100
 * 1~100 까지 합 = 5050
 * 1~100 까지 짝수 합 = 2550
 * 1~100 까지 홀수 합 = 2500
 *
 * @author  김세민
 * @version 1.0
 * @since   2025-09-10 // 작성일
 */
public class Quize01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;           // 조건 값
		int num;         // 입력값 저장 
		int totalSum = 0; //전체 합계
		int oddSum = 0;  //홀수 합계
		int evenSum = 0; //짝수 합계
		
		System.out.print("수 ? ");
		num = sc.nextInt();
		
		//1부터 입력받은 수 까지 홀수 출력하기
		n = 1;
		while(n <= num) {
			totalSum += n;
			evenSum += n%2 == 0 ? n : 0;			
			oddSum  += n%2 == 1 ? n : 0;
			n++;
		}
		System.out.println("1부터 100까지의 합 :" + totalSum);
		System.out.println("1부터 100까지의 짝수합 :" + evenSum);
		System.out.println("1부터 100까지의 홀수합 :" + oddSum);
		
		sc.close();
	}

}
