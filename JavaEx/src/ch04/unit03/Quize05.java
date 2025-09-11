package ch04.unit03;

/**
 * 문제5] 1+2+3+...+100 을해서 최초 100을 넘는 n과 그때 합은 얼마인지 
 * 출력하는 프로그램을 작성하시오
 *
 * [처리조건]
 * ・ while(조건)문을 이용한다.
 *
 * [실행결과]
 * 최소의 n : 14
 * 합 : 105
 * 
 * @author  김세민
 * @version 1.0
 * @since   2025-09-10 // 작성일
 */
public class Quize05 {

	public static void main(String[] args) {
		int n; //증감자
		int sum; //합계
		
		n = 0;
		sum = 0;
		while(n < 100 && sum <= 100) {
			n++;
			sum += n;
		}
		System.out.println("최소의 n : " + n);
		System.out.println("합 : " + sum);
		
	}

}
