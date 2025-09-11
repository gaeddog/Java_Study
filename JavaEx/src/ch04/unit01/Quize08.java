package ch04.unit01;

import java.util.Scanner;

public class Quize08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String studentNo;  // 학번
		String name;       // 이름
		int midScore;      // 중간고사점수
		int lastScore;     // 기말고사점수
		int absentCnt;     // 결석회수
		int reportScore;   // 레포트점수
		int totalScore;    // 총점
		int absentScore;   // 출석점수
		char hakjum;       // 학점
				
		System.out.print("학번 입력 ? ");
		studentNo = sc.next();
		
		System.out.print("이름 입력 ? ");
		name = sc.next();
		
		System.out.print("중간고사 점수 ? ");
		midScore = sc.nextInt();
		
		System.out.print("기말고사 점수 ? ");
		lastScore = sc.nextInt();
		
		System.out.print("결석 횟수 ? ");
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
        
        // 강사님 피드백 반영
        totalScore = 0;
        totalScore += midScore *0.4;
        totalScore += lastScore * 0.4;
        totalScore += absentScore * 0.1;
        totalScore += reportScore * 0.1;
        
		if (totalScore >= 90) hakjum = 'A';
		else if (totalScore >= 80) hakjum = 'B';
		else if (totalScore >= 70) hakjum = 'C';
		else if (totalScore >= 60) hakjum = 'D';
		else if (totalScore >= 80) hakjum = 'B';
		else hakjum = 'F';
		
		
		System.out.println("학번\t 이름\t 중간고사\t 기말고사\t 출석점수\t 레포트\t 합산\t 학점");
		System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %d\t %c\t",studentNo,name,midScore,lastScore,absentScore,reportScore,totalScore,hakjum);
		
		sc.close();
	}

}
