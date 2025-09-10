package ch02.unit04;

public class Ex02_Literal {
	public static void main(String[] args) {
		int a = 0b101; // 이진수
		int b = 0101; // 8진수
		int c = 101; // 10
		int d = 0x101; // 16진수
		long e = 101L; // 8진수
		
		System.out.println(a + "," + b + ","+ c + "," + d);
		System.out.println(e);
		
		a = 0xAB3;
		System.out.println(a); //2739
	}

}
