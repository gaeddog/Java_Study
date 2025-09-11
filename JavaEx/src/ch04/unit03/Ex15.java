package ch04.unit03;

public class Ex15 {
	public static void main(String[] args) {
		int n, s, cnt;

		// 1-10 홀수
		n = 1;
		s = 0;
		cnt = 0;
		while(n <= 100) {
			s += n;
			System.out.printf("%4d", n);
			if(++cnt % 5 == 0) {
				System.out.println();
			}
			n += 2;
		}
		System.out.println("\n홀수 합: " + s);
	}

}
