package ch04.unit01;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		double avg;
		
		System.out.print("점수 입력 ? ");
		score = sc.nextInt();
		
		if( 95 <= score && score <= 100) {
			avg = 4.5;
		} else if( 90 <= score && score < 95) {
			avg = 4.0;
		} else if( 85 <= score && score < 90) {
			avg = 3.5;
		} else if( 80 <= score && score < 85) {
			avg = 3.0;
		} else if( 75 <= score && score < 80) {
			avg = 2.5;
		} else if( 70 <= score && score < 75) {
			avg = 2.0;
		} else if( 65 <= score && score < 70) {
			avg = 1.5;
		} else if( 60 <= score && score < 65) {
			avg = 1.0;
		} else {
			avg = 1.0;
		}
		
		System.out.println("점수 :" + score + " " + "평점 :" + avg);
		
		sc.close();

	}

}
