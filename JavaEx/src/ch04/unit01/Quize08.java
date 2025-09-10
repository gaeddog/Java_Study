package ch04.unit01;

import java.util.Scanner;

public class Quize08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		String name;
		int midScore;
		int lastScore;
		int absentCnt;
		int reportScore;
		int totalScore;
		int absentScore;
		char hakjum;
		
		System.out.println("학번\t 이름\t");
		
		System.out.print("학번 입력 ? ");
		studentNo = sc.next();
		
		System.out.print("이름 입력 ? ");
		name = sc.next();
		
		System.out.print("중간 점수 ? ");
		midScore = sc.nextInt();
		
		System.out.print("기말 점수 ? ");
		lastScore = sc.nextInt();
		
		System.out.print("결석 회수 ? ");
		absentCnt = sc.nextInt();
		
		System.out.print("레포트 점수 ? ");
		reportScore = sc.nextInt();

        if(absentCnt >= 6) {
        	absentScore = 0;
        } else if (absentCnt >= 4) {
        	absentScore = 60;
        } else if (absentCnt >= 2) {
        	absentScore = 80;
        } else {
        	absentScore = 100;
        }
        
		totalScore = (int)(midScore * 0.4) + (int)(lastScore * 0.4 ) + (int)(absentScore * 0.1) + (int)(reportScore * 0.1);

		if (totalScore >= 90) {
			hakjum = 'A';
		} else if (totalScore >= 80) {
			hakjum = 'B';
		} else if (totalScore >= 70) {
			hakjum = 'C';
		} else if (totalScore >= 60) {
			hakjum = 'D';
		} else if (totalScore >= 80) {
			hakjum = 'B';
		} else {
			hakjum = 'F';
		}
		
		System.out.println("학번\t 이름\t 중간고사\t 기말고사\t 출석점수\t 레포트\t 합산\t 학점\t");
		System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %d\t %c\t",studentNo,name,midScore,lastScore,absentScore,reportScore,totalScore,hakjum);
		
		sc.close();
	}

}
