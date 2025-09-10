package ch02.unit04;

public class Ex03_DataType {

	public static void main(String[] args) {
		short a = 350;
		short b = -350;
		System.out.printf("a=%X, b=%X\n", a,b); //a=15E, b=FEA2
		System.out.printf("a=%04X, b=%04X\n", a,b);
		//a=015E, b=FEA2
		
		byte b1 = (byte)129;
		byte b2 = (byte)385;
		
		System.out.println(b1 + "," + b2);  //127 , -127
		System.out.println(b1 == b2);  //true

	}

}
