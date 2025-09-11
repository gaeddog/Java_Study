package ch04.unit03;

/**
 * 문제3] A~Z 까지의 영문자를 한 줄에 5개씩 출력하는 프로그램을 작성하시오
 *
 * [처리조건]
 * ・ while(조건)문을 이용한다.
 *
 * [실행결과]
 * A B C D E
 * F G H I J
 * K L M N O
 * P Q R S T
 * U V W X Y
 * Z 
 *
 * @author  김세민
 * @version 1.0
 * @since   2025-09-10 // 작성일
 */
public class Quize03 {

	public static void main(String[] args) {
		char c = 'A';
		int i = 0;
		while(c <= 'Z') {
			i++;
			System.out.print(c + (i%5==0? "\n":" "));
			c++;
		}
		System.out.println();

	}

}
