package ch02.unit05;

public class Ex01_var {

	public static void main(String[] args) {
		// var : 지역변수 유형 추론(JDK 10 이상)
		var a = 10;
		int n = a;
		
		System.out.println(a + ", " + n);
		
		//var s; // 컴오류. 반드시 초기화가 필요
		var s = "korea";

		System.out.println(s instanceof String);
		
	}

}
