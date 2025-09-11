package ch04.unit02;

import java.util.Scanner;

/*
 * 점수를 입력받아 학저무하기
 * 단 입력받은 점수는 0 -100 사이로 가정함
 * 90-100:A 80-89:B 70-79:C 60-69D 나머지 F
 * 
 */

public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		String grade;
		
		System.out.printf("점수 ? ");
		score = sc.nextInt();
		
		switch(score / 10) {
		case 10: 
		case  9: grade = "A"; break;
		case  8: grade = "B"; break;
		case  7: grade = "C"; break;	
		case  6: grade = "D"; break;
		default: grade = "F"; break; 	
		}
		
		System.out.println(score + " -> " + grade);
		
		sc.close();
	}

}
