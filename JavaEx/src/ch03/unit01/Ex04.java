package ch03.unit01;

public class Ex04 {
	public static void main(String[] args) {
		int a = 3, b = 2;
		double c;
		c = a / b + a / b;
		System.out.println(c);
		
		c = (double)a / b + a / b;
		System.out.println(c);
		
		c = (double)a / b + (double)a / b;
		System.out.println(c);
		
		// 실수도 나머지(%) 연산이 가능
		c = 3.7 % 1.3;
		System.out.println(c);
		
		c = 'A' + 10;
		System.out.println(c); //75.0
	}
}
