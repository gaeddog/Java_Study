package ch04.unit02;

import java.util.Scanner;

/*
 * 강화된 switch
 * : 여러조건
 *	 case 값1, 값2, 값3 -? 수식
 * : (->) 화살표 case라벨을 사용하면 마지막에 break를 사용한 것과 동일함
 * : (->) 화살표 case라벨을 사용할때 두줄 이상의 구문은 반드시 중괄호({})로 묶어준다.
 * : JDK 14부터 표준화
 */

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
    
        System.out.print("년도 ? ");
        y = sc.nextInt();
        System.out.print("월 ? ");
        m = sc.nextInt();
        
        switch(m) {
        case 1, 3, 5, 7, 8, 10 ,12 -> d = 31;
        case 4, 6, 9, 11 -> d = 30;
        case 2 -> d = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
        default -> d = -1;
        }
        
        if( d == -1) {
        	System.out.println("월 입력 오류...");
        } else {
        	System.out.printf("%d년도 %d월의 마지막 일자는 %d\n", y,m,d);
        }
        
        sc.close();

	}

}
