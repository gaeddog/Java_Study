package ch04.unit02;

import java.util.Scanner;

public class Ex01_switch {

	public static void main(String[] args) {
		/*
		int n = 2;
		switch (n) {
		case 3: System.out.println('A');
		case 2: System.out.println('B');
		case 1: System.out.println('C');
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.printf("정수 ? ");
		n = sc.nextInt();
		
		// switch : byte, short, char, int, String, enum만 가능
		//          boolean, long, float, double은 불가
		switch (n) {
		case 3: System.out.print('*');
		case 2: System.out.print('*');
		case 1: System.out.print('*');
		}
		
		System.out.println();
		
		sc.close();
	}

}
