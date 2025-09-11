package ch04.unit03;

/**
 * 문제4] 1~100까지 수중 3 또는 5의 배수 합과 평균을 구하는 프로그램을 작성하시오
 *
 * [처리조건]
 * ・ 합은 while(조건)문을 이용한다.
 * ・ 평균은 int형으로 처리한다.
 *
 * [실행결과]
 * 합 : 2418
 * 평균: 51
 *
 * @author  김세민
 * @version 1.0
 * @since   2025-09-10 // 작성일
 */
public class Quize04 {

	public static void main(String[] args) {
		int n;   // 조건 증가값
		int sum; // 총합
		int cnt; // 건수
		
		n = 0;
		sum = 0;
		cnt = 0;
		while(n < 100) {
			n++;
			sum += n % 3 ==0 || n % 5 ==0 ? n : 0;
			cnt += n % 3 ==0 || n % 5 ==0 ? 1 : 0;
		}
		System.out.println("합 : " + sum);
		System.out.println("평균: " + sum/cnt);

	}

}
