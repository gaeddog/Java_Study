package ch03.unit01;

public class Ex03 {

	public static void main(String[] args) {
		int a;
		// 정수 연산자 정수 => 정수
		a = 3 / 2 + 1 / 2 + 2 / 3; // 1 + 0 + 0
		System.err.println(a);
		
		double b;
		// 정수 연산자 정수 => 정수
		b = 3 / 2 + 1 / 2 + 2 / 3; // 1 + 0 + 0
		System.err.println(b); // 1.0

		// 정수 연산자 실수 = 실수 연산자 실수
		b = 3 / 2. + 1 / 2 + 2 / 3; // 1.5 + 0 + 0
		System.err.println(b); // 1.5

		
		b = (double)(3 / 2 + 1 / 2 + 2 / 3); // (double)(1 + 0 + 0)
		System.err.println(b); // 1.0
	}

}
