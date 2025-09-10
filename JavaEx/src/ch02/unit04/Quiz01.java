package ch02.unit04;

import java.util.Scanner;

/*
 * 
 * 
 */

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("한문자 ? ");
		ch = sc.next().charAt(0);
		
		System.out.printf("문자코드 : %d", (int)ch);
		
		sc.close();
				
				

	}

}
