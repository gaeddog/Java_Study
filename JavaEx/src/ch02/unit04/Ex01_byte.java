package ch02.unit04;

public class Ex01_byte {

	public static void main(String[] args) {
		byte b1; // 바이트 변수 선언
		byte b2 = 10; // 변수 선언과 동시에 초기화
		//byte b3 = 130; // 컴파일 오류, 표현 범위를 벗어남
		
		//System.out.println(b1); //컴파일 오류. 초기화 되지 않는 변수를 사용
		System.out.println(b2);
		
		b2 = 20; // 프로그램 실행도중에 값을 변경. 이전값은 기억 불가
		System.out.println(b2);
		
		short s1, s2 = 100; // 2byte 변수
		s1 = 'A'; // 문자는 사실 정수이다. 65 저장
		System.out.println(s1 +  "," + s2);

		int i1 = 200;
		int i2 = 'a';
		int i3;
		
		i3 = '1' + '2'; // 49 + 50
		System.out.println(i1 + ", " + i2 +  ", " + i3);
		
		//b2 = 'a';
		//b1 = i2; // 컴오류, 큰자료형의 변수를 적은자료형의 대입불가
		b1 = (byte)i2; // 강제로 형 변환
		System.out.println(b1); // 97
		
		b1 = (byte)i1;  // 오버클로우 발생
		System.out.println(b1); // -56
		
		long l1, l2;
		l1 = 100; // int형의 리터널 LONG에 대닙 ( 작은 자료를 큰자료로 대입)
		l2 = 11; // int 변수 값을 long에 대입
		System.out.println(l1 +"," + l2);
		
		//l2 = 2200000000 //컴파일 오류 22억은 int 범위를 벗어남
		l2 = 2200000000L; // long형 리터널
		
		System.out.println(l2);
		
	}

}
