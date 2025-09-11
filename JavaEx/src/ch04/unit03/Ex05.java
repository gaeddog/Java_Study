package ch04.unit03;

public class Ex05 {

	public static void main(String[] args) {
		/*
		char c = 64;
		while(c++ < 'Z') {
			System.out.print(c + " ");
		}
		System.out.println();
		*/
		/*
		char c = 'A';
		while(c <= 'Z') {
			System.out.print(c + " ");
			c++;
		}
		System.out.println();
		*/
		
		// 한줄에 7개씩 찍어라
		/*
		char c = 'A';
		int i = 0;
		while(c <= 'Z') {
			i++;
			if(i%7 == 0 ) {
				System.out.println();
			}
			System.out.print(c + " ");
			c++;
		}
		System.out.println();
		*/
		
		char c = 'A';
		int i = 0;
		while(c <= 'Z') {
			i++;
			System.out.print(c + (i%7==0? "\n":" "));
			c++;
		}
		System.out.println();
	}

}
