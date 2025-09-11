package ch04.unit03;

import java.util.Scanner;

/**
 * 문제6] 두정수를 입력받아 입력 받은 수중 적은 수에서 큰 수까지의 합을 구하는
 * 프로그램을 작성하시오
 *
 * [처리조건]
 * ・ 합은 while(조건)문을 이용한다.
 * ・ 정수의 입력은 Scanner 클래스의 nextInt() 메소드를 이용한다.
 * 
 * [작성순서]
 * ・ 두정수를 입력 받는다.
 * ・ if문을 이용하여 입력 받은 두 정수중 적은수와 큰수를 구한다.
 * ・ while문을 이용하여 적은 수에서 큰 수까지 합을 계산한다.
 *
 * [실행결과]
 * 두수 ? 10 100
 * 10부터 100까지의 합 : 5005
 * 
 * @author  김세민
 * @version 1.0
 * @since   2025-09-10 // 작성일
 */
public class Quize06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;  // 입력변수 저장 
		int t = 0; // 스왑용 변수
		int i;     // 증감자
		
		int sum;
		
		System.out.print("두수 ? ");
		n = sc.nextInt();
		k = sc.nextInt();
		 
		// 입력받은 n과 k를 스왑하여 n에 작은수 k에 큰수가 오게함
		if (n > k) {
			t = n;
			n = k;
			k = t;
		}
		
		sum = 0;
		i = n;
		while(i <= k) {
            sum += i;
			i++;
		}
		System.out.printf("%d부터 %d까지의 합 : %d", n, k, sum);

		sc.close();
	}

}
