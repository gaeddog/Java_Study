package ch04.unit01;

import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int workHour;
		int pay = 10000;
		double totalPay = 0;
		
		System.out.print("근무 시간 ? ");
		workHour = sc.nextInt();

		if(workHour > 8) {
			totalPay  = (workHour - 8) * pay * 1.5;
			totalPay  = totalPay + 8 * pay;
		} else {
			totalPay  = workHour * pay;
		}
		System.out.println("근무시간 :" + workHour);
		System.out.printf("급여 : %,d" , (int)totalPay);
		
		sc.close();

	}

}
