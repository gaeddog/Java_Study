package ch04.unit01;

import java.util.Scanner;

public class Quize07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int score1;
		int score2;
		int score3;
		int total;
		String msg;
		
		System.out.print("이름 입력 ? ");
		name = sc.next();
		
		System.out.print("세과목 점수 ? ");
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		score3 = sc.nextInt();
		
		total = score1 + score2 + score3; 
		
		if( 40 <= score1 && 40 <= score2  && 40 <= score3) {
			if((total/3) > 60) {
				msg = "합격";
			} else {
				msg = "불합격";
			}
		} else {	
			msg = "과락";
		} 
		
		System.out.println("이름 :" + name);
		System.out.printf("세과목 점수 %d %d %d\n", score1, score2, score3);
		System.out.println(name + "님은 " + msg + "입니다.");
		
		sc.close();
	}

}
