package ch04.unit03;

public class Ex16 {

	public static void main(String[] args) {
		// 1 ~100 까지 숫자 중 3또는 5의 배수를 제외하고 찍어라
		// 5개를 찍으면 라인을 넘겨라
		int n,cnt;

		n = 0;
		cnt = 0;
		while(n < 100) {
			n++;
			if(n%3 !=0 && n%5 != 0) {
				System.out.printf("%4d", n);
				if(++cnt %5 ==0) {
					System.out.println();
				}
			}
		}
	}
}
