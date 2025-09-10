package ch02.unit03;

public class Ex03_printf {

	public static void main(String[] args) {
		int a = 013; //0x : 16진수 0:8진수
		System.out.println(a);
		
		int b= 19; //0x : 16진수 0:8진수
		System.out.printf("%x\n", b);
		
		b= 19; //# 몇 진수인지 표현
		System.out.printf("%#x\n", b);
		
		int c = 10, d = 7;
		System.out.printf("%d %d %d %d\n", c, d, d, c);
		// %1$ : 첫번째 변수
		System.out.printf("%1$d %2$d %2$d %1$d\n", c, d);
		
	}

}
