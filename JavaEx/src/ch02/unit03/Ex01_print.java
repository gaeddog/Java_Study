package ch02.unit03;

/*
 * System.out.print(인수);
 * : 인수의 내용을 출력 장치를 통해 출력하며, 출력후 라인은 넘기지 않는다.
 */

public class Ex01_print {

	public static void main(String[] args) {
		//System.out.print(); 컴오류 : 괄호안에 출력할 내용이 없으면 에러
		System.out.print("HTML 5, ");
		System.out.print("javascript, ");
		System.out.print("CSS #, ");
		System.out.print("\n"); // 라인을 넘기세요
		
		System.out.print("JAVA\nJSP\n");
		System.out.print("Spring");
		System.out.print("\nOracle\n\n");
		
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\n");
		System.out.print(90 + "\t");
		System.out.print(85 + "\t");
		System.out.print(95 + "\n");
		
		System.out.println("end...");
	}

}
