package ch02.unit02;

/*
 * 식별자
 */

public class Ex_Identifier {

	public static void main(String[] args) {
		// 타입 변수명 = 초기값;
		String name = "홍길동";
		String _tel = "010-1234-2356";
		String 주소 = "서울시 마포구";
		//String int; //컴파일에러. 식별자는 예약어 불가
		//String #name; //컴파일에러. 특수문자 사용 불가
		//String name = "김자바"; //컴파일에러. 동일한 이름으로 다시 선언할 수 없음
		
		int $age = 20;
		//int age-1 = 10; // 컴파일 에러 
		int a = 100; // a와 같은 모호한 이름은 지양
		
		System.out.println("name : " + name);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);
		System.out.println("$age : " + $age);
		System.out.println("a : " + a);

	}

}
