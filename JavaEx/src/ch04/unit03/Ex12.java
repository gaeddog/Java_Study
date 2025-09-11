package ch04.unit03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력 받은 수까지 합구하기
		int num;
		int n,s;
		
		System.out.print("정수 ?");
		num = sc.nextInt();
		
		n = 0;
		s = 0;
				
		while (n < num) {
			n++;
			s += n;
			if(n%10 ==0) {
				System.out.println("1~" +n + "까지합 :" + s);
			}
		}
		sc.close();

	}

}
