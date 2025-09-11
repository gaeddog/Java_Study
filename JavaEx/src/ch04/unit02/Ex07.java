package ch04.unit02;

import java.util.Scanner;

/*
 * - switch 표현식
 * : -> 또는 yeild 를 사용하여 값을 변환
 * : -? 반드시 default 가 필요
 * : 수식이 두줄 이상인 경우 {}가 필요하고
 *   {} 안에서 값을 반환 할때 yeild 사용
 * : switch ~ case 구문 마지막에 ;로 필요
 * : JDK 14부터 사용가능  
 */

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
    
        System.out.print("년도 ? ");
        y = sc.nextInt();
        
        System.out.print("월 ? ");
        m = sc.nextInt();
        
        
        // 무조건 switch 문장에 default 값이 있어야 한다.
        /*
        d = switch(m) {
        case 1, 3, 5, 7, 8, 10 ,12 -> 31;
        case 4, 6, 9, 11 -> 30;
        default -> y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
        };
        */
        d = switch(m) {
        case 1, 3, 5, 7, 8, 10 ,12 -> 31;
        case 4, 6, 9, 11 -> 30;
        default -> {
        	int n = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
        	yield n;
        	}
        };
        
        System.out.printf("%d년도 %d월의 마지막 일자는 %d\n", y,m,d);
        
        sc.close();
	}

}
