package ch04.unit03;

/**
 * 문제2] 1-2+3-4+ ... +9-10의 연산 결과를 출력하는 프로그램을 작성하시오
 *
 * [처리조건]
 * ・ 합은 while(조건)문을 이용한다.
 *
 * [실행결과]
 * 결과 : -5
 *
 * @author  김세민
 * @version 1.0
 * @since   2025-09-10 // 작성일
 */
public class Quize02 {

	public static void main(String[] args) {
		
		int n, sum;
			
		//1부터 입력받은 수 까지 홀수 출력하기
		n = 0;
		sum = 0;
		while(n < 10) {
			n++;
			sum += n%2!=0?n:-n; //짝수면 음수를 취한다.
		}
		System.out.println("결과 : " + sum);
	}

}
