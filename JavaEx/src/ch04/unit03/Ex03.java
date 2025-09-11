package ch04.unit03;

public class Ex03 {

	public static void main(String[] args) {
		int n = 0;
		
		// 1-10 짝수
		while(n < 10) {
			n += 2;
			System.out.print(n + " ");
		}
		System.out.println("\n밖:" + n);
	
		
		// 1-10 홀수
		n = 1;
		while(n < 10) {
			System.out.print(n + " ");
			n += 2;
		}
		System.out.println("\n밖:" + n);
		
	}

}
