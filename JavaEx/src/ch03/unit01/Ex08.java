package ch03.unit01;

public class Ex08 {
	public static void main(String[] args) {
		String s;
		s = "korea" + 9 + 3;
		System.out.println(s);  //korea93
		
		s = 9 + 3 + "korea";
		System.out.println(s); //12korea
		
		s = 'A' + 3 + "korea";
		System.out.println(s); //68korea
		
		s = 'A' + "korea" + 3;
		System.out.println(s); //Akorea3
	}
}
