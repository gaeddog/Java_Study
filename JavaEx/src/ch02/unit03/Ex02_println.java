package ch02.unit03;

/*
 * System.out.println([인수]);
 * 출력후 라인을 넘긴다.
 * System.out.println()은
 * System.out.print("\n") 과 동일
 */

public class Ex02_println {

	public static void main(String[] args) {
		System.out.println("HTML 5");
		System.out.println("CSS 3");
		System.out.println();
		
		System.out.println("JAVA\n");
		System.out.println("ORACLE");
		System.out.println();
		
		System.out.println("국어\t영어\t수학\t");
		System.out.println(80 + "\t" + 90 + "\t" + 85);
	}

}
