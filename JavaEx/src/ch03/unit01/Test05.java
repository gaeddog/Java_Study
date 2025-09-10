package ch03.unit01;

import java.util.Scanner;

/*
 * 주행거리(km)와 시속(km/h)을 입력받아
 * 소요시간을 시분초형태로 변환한다.
 * 단 초의 경우 소수 3자리에서 버리고 2자리까지만 표현 
 * 
 */

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance;     //주행거리 변수
		int hourSpeed;    //시속변수
		int hour, minute; // 소요시, 소요분을 나타냄
		double second;    // 소요초를 나타탬
		double secondSpeed; //시속을 초속으로 변환
		double totalSecond; //총거리를 초속으로 나누어 총 소요초를 구함
		
		// 주행거리 입력
		System.out.print("주행 거리(km) ? ");
		distance = sc.nextInt();
		
		// 시속 입력
		System.out.print("시속(km/h) ? ");
		hourSpeed = sc.nextInt();
		
		//초속을 구함
		secondSpeed = (double)hourSpeed / 60 / 60; // double/int/int
		//총 소요초를 구함
		totalSecond = distance/secondSpeed;        // int/double
        //소요시간 계산
		hour = (int)(totalSecond/3600);            // double/int => int로 변환하여 몫만 취함      
		//소요분 계산
		minute = (int)(totalSecond%3600/60);       // double/int => int로 변환하여 몫만 취함
		//소요초를 계산
		second = (totalSecond%60);                 // double%int => double
		//소요초를 소수 3자리에서 버림
		second = (int)(second * 100) /100.;        // 100을 곱하여 소수2째자리까지 정수로 만들고 나머지 버림 100.으로 나누어 다시 소수화함
		
		System.out.printf("%d km => %d시간 %d분 %.2f초 소요",distance, hour, minute, second);
		
		sc.close();

	}

}
