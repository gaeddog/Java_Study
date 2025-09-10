package ch03.unit04;

public class Ex01 {

	public static void main(String[] args) {
		// 배정 대입 연산자
		short a,b;
		
		a = 10;
		b = 5;
		a = (short)(a+b); //형변환 필요
		System.out.println(a);

		a = 10;
		b = 5;
		a += b; // 배정연산, 형변환이 일어나지 않는다.
		        // a = a + b; 와 동일한 결과
		System.out.println(a);	
		
		char c = 'A';
		c += 10;
		System.out.println(c);
		
		float f = 3.5f;
		c = 'A';
		c += f;
		System.out.println(c);
		
		int n = 4;
		n *= 0.5;
		System.out.println(n);
		
	}

}
