package ch04.unit03;

/**
 * 문제7] x는 100부터 시작해서 1초마다 2씩 증가하고 y는 0부터 시작해서
 * 1초마다 5씩 증가한다. 몇 초 후에 y가 x를 따라 잡는지와 따라 잡았을때
 * x와 y의 값을 구하는 프로그램을 작성하시오
 *
 * [처리조건]
 * ・ while(조건)문을 이용한다.
 * 
 * [실행결과]
 * x : 168, y : 170
 * 걸린시간 : 34초
 * 
 * @author  김세민
 * @version 1.0
 * @since   2025-09-10 // 작성일
 */
public class Quize07 {

	public static void main(String[] args) {
		int i;
		int x;
		int y;
		
		i = 0;
		x = 100;
		y = 0;
		
		//y가 x이상일 경우 멈춤
		while(y < x) {
			i++;
			x += 2;
			y += 5;
			
	    }
		System.out.printf("x : %d, y : %d\n",x,y);
		System.out.printf("걸린시간 : %d초",i);
	}
}
