package ch02.unit04;

public class Ex09_String {

	public static void main(String[] args) {
		String s1, s2, s3;
		
		s1 = "Seoul";
		s2 = "Korea";
		s3 = s1 + s2; // 문자열 + 문자열 => 문자열 결합
		System.out.println(s3);
		
		s3 = ""; // 길이가 0인 문자열
		System.out.println(s3.length()); // 문자열 길이 0
		
		// 문자열 + 기본자료형 => 문자열로 결합
		s3 = "X" + 'A' + 10;
		System.out.println(s3); // XA10
		
		s3 = 'A' + 10 + "X";  //75X
		System.out.println(s3);
		
		System.out.printf("%d", (int)'A');
		//System.out.printf("%d", 'A');
		
		System.out.printf("%d", 020);
		System.out.println('\101');
	}

}
