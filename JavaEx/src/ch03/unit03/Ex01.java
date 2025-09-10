package ch03.unit03;

public class Ex01 {

	public static void main(String[] args) {
		int a,b;
		
		a = 10;  // 0000 1010
		b = ~a;  // 1111 0101 비트단위 not
		System.out.println(a + " , " + b);
		
		
		a = -10;
		b = ~a;
		System.out.println(a + " , " + b);
		
		
		a = 13;  // 0000 1101
		b = 7;  //  0000 0111
		System.out.println(a + " , " + b);

		System.out.println("a & b : " + (a & b)); //비트단위 and
		        // 0000 0101 : 5
		System.out.println("a | b : " + (a | b)); //비트단위 or
		        // 0000 1111 : 15
		System.out.println("a & b : " + (a ^ b)); //비트단위 xor
		        // 0000 1010 : 10
	}

}
