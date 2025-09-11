package ch04.unit01;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		char b;
		
		System.out.print("한문자 ? ");
		ch = sc.next().charAt(0);
		
		b = ch;
		if(ch >= 'A' && ch <= 'Z') {
			b += 32;
		} else if(ch >= 'a' && ch <= 'z') {
			b -= 32;
		} 
		System.out.println(ch + " => " + b);
	
		sc.close();

	}

}
