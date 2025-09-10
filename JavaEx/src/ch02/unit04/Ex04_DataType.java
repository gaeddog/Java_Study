package ch02.unit04;

public class Ex04_DataType {

	public static void main(String[] args) {
		/*
		 * byte < short < int < long < float < double
		 *        char < int < long < float < double
		 */
		
		// float : 단정도형 실수
		float f1 = 0; // int 리터널을 float 변수에 대입
		float f2 = 0.5f; // 단정도형 리터널
		float f3 = 1.2e04f; // 1.2 * 10의 4승
		float f4;
		
		System.out.println(f1 + ", " + f2 + ", " + f3);
		
		f4 = 'A';
		System.out.println(f4);
		
		//f4 = 0.0; // 0.0 : 배정도형(double)이므로 float 대입불가 0.0f
		
		//double : 배정도형 실수
		double d1 = 0.5;
		double d2 = 3.14D;
		double d3 = 1.2e04;
		double d4 = 1.2e-04;
		double d5 = 1546546.45646546;
		
		System.out.println(d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5);
		// 0.5, 3.14, 12000.0, 1.2E-4
		

	}

}
