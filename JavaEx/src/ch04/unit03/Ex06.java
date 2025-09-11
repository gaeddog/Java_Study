package ch04.unit03;

public class Ex06 {
	
	public static void main(String[] args) {
		// 1 -10 까지 합
		/*
		int n,s;
		n = s = 0;
		while(n < 10 ) {
			n++;
			s+=n;
		}
		System.out.println("결과:" + s);
		*/
		/*
		int n = 0,s = 0;
		while(n++ < 10 ) {
			s+=n;
		}
		System.out.println("결과:" + s);
		*/
		int n,s;
		n = 0;
		s = 0;
		while(++n <= 10 ) {
			s+=n;
		}
		System.out.println("결과:" + s);
		
	}

}
