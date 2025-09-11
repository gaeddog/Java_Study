package ch04.unit02;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
        String op, result; 
        
        System.out.print("두수 ? ");
        a = sc.nextInt();
        b = sc.nextInt();
		
        System.out.print("연산자[+-*/] ? ");
        op = sc.next();
        
        //switch에서는 equals를 안써도 문자열 비교가 가능하다.
        switch(op) {
        case "+": result = a + "+" + b + "=" + (a+b); break;
        case "-": result = a + "-" + b + "=" + (a-b); break;
        case "*": result = a + "*" + b + "=" + (a*b); break;
        case "/": result = a + "/" + b + "=" + (a/b); break;
        default : result = "입력 오류"                 ; break;
        }
        
        System.out.println(result);
        
		sc.close();

	}

}
