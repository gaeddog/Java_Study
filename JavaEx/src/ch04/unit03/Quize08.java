package ch04.unit03;

/**
 * 문제8] 1+2+4+7+11+ ...의 20번째 항까지의 합을 구하는 프로그램을 작성하시오
 *
 * [처리조건]
 * ・ 합은 while(조건)문을 이용한다.
 *
 * [실행결과]
 * 결과 : 1350
 * 
 * @author  김세민
 * @version 1.0
 * @since   2025-09-10 // 작성일
 */
public class Quize08 {
	public static void main(String[] args) {
		int d;  // 공차
		int a;	// 공차를 반영한 항목값
		int sum; // 항목을 누적함
		
		//1부터 입력받은 수 까지 홀수 출력하기
		d = 0; // 공차는 0부터 시작
		a = 1;
		sum = 0;
		while(d < 20) {	
			a += d;
			sum += a;
			d++;
		}		
		 System.out.println("결과 : " + sum);
	}
}
