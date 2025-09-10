package ch03.unit01;

import java.util.Scanner;

/*
 * 금액을 입력 받아 5만원권에서 1원권까지 화폐 매수 구하기
 * 금액 ? 67500
 * 5만 : 1매
 * 1만 : 1매
 * 5천 : 1매
 * 1천원 2매
 * 5백원 : 1매
 * 1백원 : 0매
 * 5십원 : 0매
 * 1십원 : 0매
 */

public class Quize02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("금액 ? ");
		n = sc.nextInt();
		
		System.out.println("5만원권 : " + (n/50000));
		System.out.println("1만원권 : " + (n%50000)/10000);
		System.out.println("5천원권 : " + (n%10000)/5000);
		System.out.println("1천원권 : " + (n%5000)/1000);
		System.out.println("5백원권 : " + (n%1000)/500);
		System.out.println("1백원권 : " + (n%500)/100);
		System.out.println("5십원권 : " + (n%100)/50);
		System.out.println("1십원권 : " + (n%50));
		
		sc.close();
	}
}
