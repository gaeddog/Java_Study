package ch04.unit03;

public class Ex10 {

	public static void main(String[] args) {
		// 10! 구하기
		
		int i = 0;
		int sum = 1;
		
		while(i< 10) {
			i++;
			sum *= i;
		}
		
		System.out.println(sum);

	}

}
