package ch03.unit03;

public class Ex02 {

	public static void main(String[] args) {
		// shift연산자
		int a,b;
		
		a = 128;
		
		b = a << 3; // a를 2의 3승에 곱한 값
		// 좌측으로 3비트를 이동하고 남은 차리에 0을 채움
		System.out.println("128 << 3" + b);

		b = a >> 3; // a를 2의 3승으로 나눈 값
		// 우측으로 3비트 이동하고 남은자리에 부호로 채움
		System.out.println("128 >> 3" + b);
		
		a = -128;
		b = a >> 3;
		System.out.println("-128 >> 3" + b);
		
		a = -128;
		b = a >>> 3;
		System.out.println("-128 >> 3" + b);
	}

}
