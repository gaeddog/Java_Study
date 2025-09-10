package ch04.unit01;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		double avgScore;
		
		System.out.print("점수 입력 ? ");
		score = sc.nextInt();
		
		if( 95 <= score) {
			avgScore = 4.5;
		} else if( 90 <= score) {
			avgScore = 4.0;
		} else if( 85 <= score) {
			avgScore = 3.5;
		} else if( 80 <= score) {
			avgScore = 3.0;
		} else if( 75 <= score) {
			avgScore = 2.5;
		} else if( 70 <= score) {
			avgScore = 2.0;
		} else if( 65 <= score) {
			avgScore = 1.5;
		} else if( 60 <= score) {
			avgScore = 1.0;
		} else {
			avgScore = 0.0;
		}
		
		System.out.println("점수 :" + score + ", " + "평점 :" + avgScore);
		
		sc.close();

	}

}
