package ch03.unit02;

public class Ex03 {

	public static void main(String[] args) {
		int a;
		boolean b1, b2;
		
		// 단축연산 : &&는 앞이 거짓이면 뒤쪽연산을 하지 않는다.
		a = 10;
		b1 = false;
		b2 = a > 20 && (b1 = true);
		System.out.println(b1 + "," + b2);
		
		a = 10;
		b1 = false;
		b2 = a < 20 && (b1 = true);
		System.out.println(b1 + "," + b2);

		a = 10;
		b1 = false;
		b2 = a > 20 || (b1 = true);
		System.out.println(b1 + "," + b2);
		
		// 단축연산 : || 는 앞이 참이면 뒤쪽을연산을 하지 않는다.
		a = 10;
		b1 = false;
		b2 = a < 20 || (b1 = true);
		System.out.println(b1 + "," + b2);
		
	}

}
