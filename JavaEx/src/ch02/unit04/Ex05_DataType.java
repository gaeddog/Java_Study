package ch02.unit04;

public class Ex05_DataType {

	public static void main(String[] args) {
		int i1 = 2_000_000_000;
		int i2 = 2_000_000_050;
		
		System.out.println(i1 == i2); //false

		// float는 정밀도가 낮으므로 사용할때 주의 해야 한다. 정밀도를 요구하는 프로그램에서 안씀
		float f1 = 2_000_000_000;
		float f2 = 2_000_000_050;
		
		System.out.println(f1 == f2); //true
		System.out.printf("%.2f, %.2f\n", f1, f2);
		
		
		double d1 = 2_000_000_000;
		double d2 = 2_000_000_050;
		
		System.out.println(d1 == d2); //false
		System.out.printf("%.2f, %.2f\n", d1, d2);
		
		
		
	}

}
