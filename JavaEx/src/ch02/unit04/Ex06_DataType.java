package ch02.unit04;

public class Ex06_DataType {

	public static void main(String[] args) {
		// char : 2byte, 부호없는 정수
		char c1 = 'A', c2;
		c2 = '\u0041'; 
		
		System.out.println(c1 +", " + c2); //A, A
		
		c1 = '대';
		System.out.println(c1);
		
		//c1 = '' // 컴오류
		//c2 = 'AB' // 컴오류
		
		int a = c1; // 가능 int > char
		System.out.println(a);
		a = '한';
		System.out.println(a);
		char c3 = 54620;
		System.out.println(c3);
		
		a = 0;
		System.out.println(a);
		
		a = '0';
		System.out.println(a);
		
		double k = 'K';
		System.out.println(k);
	}

}
