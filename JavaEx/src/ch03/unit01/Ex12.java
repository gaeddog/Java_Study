package ch03.unit01;

public class Ex12 {

	public static void main(String[] args) {
		char ch;
		
		ch = 'A';
		//ch = ch + 1; // 컴오류
		//ch = (char)(ch + 1);		
		ch++; // ++ 는 형변환이 일어나지 않는다.
		System.out.println(ch);
		
		ch = 'A';
		System.out.printf("%c %c\n", ch++, ++ch);

	}

}
