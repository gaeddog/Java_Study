package ch04.unit01;

import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int workHour;  // 근무시간
		int extraHour; // 초과근무 시간
		int limitHour = 8; // 초과근무의 기준
		int pay = 10000;   // 시급
		int totalPay = 0; // 총급여
		int extraPay = 0; // 초과수당
		double extraRto = 1.5; // 초과수당 비율
		
		System.out.print("근무 시간 ? ");
		workHour = sc.nextInt();
        
		// 이것보다 더 좋은 방법이 있을거 같습니다.
		if(workHour > limitHour) {
			extraHour = workHour - limitHour;
			workHour  = limitHour; 
			extraPay  = (int)(extraHour * pay * extraRto);
		} 
		
		totalPay  = extraPay + (workHour * pay);
		
		System.out.printf("급여 : %,d" , totalPay);
		
		sc.close();

	}

}
