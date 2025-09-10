package ch03.unit01;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		double p, c, w;
		p = 3.141592;
		
		System.out.print("반지름 ? ");
		r = sc.nextInt();
		
		/* int * int가 먼저되어 오버플로우 발생가능성 있음
		w = r * r * p;
		c = r * 2 * p;
		*/
		
		w = p * r * r;
		c = p * r * 2;
		
		System.out.printf("넓이 : %.2f\n" , w);
		System.out.printf("둘레 : %.2f\n" , c);
		
		sc.close();

	}

}
