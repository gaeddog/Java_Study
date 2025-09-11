package ch04.unit02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.printf("정수 ? ");
		n = sc.nextInt();
		
		// break : switch ~ case 문장을 나감
		switch (n) {
		case 3: System.out.print('*');
		        System.out.print('#');
		        System.out.print('@');
		        break;
		case 2: System.out.print('*');
				System.out.print('#');
				break;
		case 1: System.out.print('*');
		        break;
		}
				
		sc.close();

	}

}
