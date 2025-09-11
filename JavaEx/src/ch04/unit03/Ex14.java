package ch04.unit03;

public class Ex14 {

	public static void main(String[] args) {
		// 1/2 + 2/3 + 3/4
		int n;
		double sum;
		
		n = 0;
		sum = 0;		
		
		while (n < 9) {
			n++;
			sum += (double)n/(n+1);
				
		}
		System.out.println("결과 :" + sum);
	}

}
