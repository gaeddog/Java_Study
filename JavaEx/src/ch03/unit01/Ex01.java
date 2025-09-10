package ch03.unit01;

/*
 * 1) 자바는 연산을 위한 기본 타입이 int 이다.
 * 2) +,-,*,/,% 연산의 피연산자가 byte, char,short이면 int로 변환하여 연산
 * 3) 피연사자 모두 리터널이면 형변환이 일어나지 않는다.
 */
public class Ex01 {

	public static void main(String[] args) {
		byte b1, b2, b3;
		b1 = 10;
		b2 = 5;
		//b3 = b1 + b2; //컴오류
		// byte + byte => int + int로 바꾸어 버림
		
		b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		b3 = 10 + 5; // 리터널 + 리너털은 형변환이 일어나지 않음
		System.out.println(b3);
		
		b1 = 100;
		b2 = 120;
		b3 = (byte)(b1 + b2);
		System.out.println(b3); //오버플로우 발생하여 쓰레기 값이 들어감
		
		short s1, s2, s3;
		s1 = 100;
		s2 = 130;
		// s3 = s1 + s2; //컴오류 short+ short = int + int 로 형변환하여 연산
		s3 = (short)(s1 + s2);
		System.out.println(s3);
		
		//s1 = s1 + 10;  //안됨
		s1 += 10;        // 됨
		
		char c1, c2;
		c1 = 'A';
		//c2 = c1 + 3; // 컴오류
		// char + int = > int + int
		c2 = (char)(c1 + 3);
		System.out.println(c2);
		
		//리터널 + 리터널
		c2 = 'A' + 5;
		System.out.println(c2);
		
		int i1, i2;
		i1 = 'A';
		i2 = i1 + 5;
		System.out.println(i2);

	}

}
