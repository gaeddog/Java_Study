package ch03.unit03;

public class Ex03 {

	public static void main(String[] args) {
		// 두변수값 변경
		int a = 7, b = 5 ,c;
		
		c = a;
		a = b;
		b = c;
		System.out.println(a + ", " + b);
		
		// ^ 연산자를 이요하여 두변수값 변경
		int x = 7, y = 5;
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		
		System.out.println(x + ", " + y);

	}

}
