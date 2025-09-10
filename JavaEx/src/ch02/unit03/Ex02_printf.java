package ch02.unit03;

/*
 * System.out.printf("출력서식", 출력값, 출력값);
 * 출력서식에 따라 값을 출력
 * 출력후 라인을 넘기지 않는다.
 * System.out.format("출력서식", 출력값, 출력값); 과 동일
 */

public class Ex02_printf {

	public static void main(String[] args) {
		int a, b, c; // 정수 값을 저장할 수 있는 변수 세개를 선언
		
		a = 12;
		b = 5;
		c = a + b;
		
		System.out.println("결과 :" + c); // 17	
		System.out.println(a + " + " + b + " = " + c); // 문자열 + 다른 자료형 => 문자열
		
		// System.out.printf("%d + %d = %d\n", a, b); // 런타임 오류
		System.out.printf("%d + %d = %d\n", a, b, c); // %d:정수를 출력할거야
		System.out.println();
		
		System.out.printf("%d + %d = %d\t", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		// 라인 넘김 \n, %n
		System.out.printf("%d * %d = %d\t", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);

		System.out.printf("%d %% %d = %d\n", a, b, a % b); // % : 나머지
		
		
	}

}
