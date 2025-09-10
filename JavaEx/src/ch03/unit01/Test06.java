package ch03.unit01;

import java.util.Scanner;

/*
 * 체중과 키를 입력받아 BMI를 산출한다.
 */

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double weight; //체중 변수
		double cmHeight; //키 변수
		double roudWeight; //체중 반올림처리
		double roudHeight; //키 반올림처리
		
		// 체중 입력
		System.out.print("체중(kg) ? ");
		weight = sc.nextDouble();
		roudWeight = ((int)(weight * 1000) + 5) / 10 * 10 / 1000.;
		
		// 키 입력
		System.out.print("키(cm) ? ");
		cmHeight = sc.nextDouble();
		roudHeight = ((int)((cmHeight / 100)* 1000) + 5) / 10 * 10 / 1000.;
		        
		System.out.printf("몸무게 : %.2fkg\n",  roudWeight);
		System.out.println("키 : " + roudHeight + "m");
        System.out.printf("BMI : %.1f", roudWeight / (roudHeight * roudHeight));
        
		sc.close();

	}

}
