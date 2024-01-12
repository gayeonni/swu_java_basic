package day02;

public class CharStringExample {

	public static void main(String[] args) {
		// 단일 문자를 저장하는 데이터 타입 char
		char c1 = 'A';
		char c2 = 66; // 단일문자는 숫자와 교환가능, ascii code 상 65는 A, 66은 ㅠ
		/*
		 * 한글 '가'를 유니코드로 표현할 때는 AC00인데
		 * 직접 코드값을 char에 저장할 때는 탈출문자 \(역슬래시)u를 왼쪽에 붙인다.
		 */
		char c3 = '\uAC00';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// 문자열을 저장할 수 있는 데이터 타입 String
		String s1 = "my dream";
		String s2 = "my dream"; // 동일 문자열은 string pool에 한 번만 저장
		// String s2 = "is an engineer";
		System.out.println(s1);
		System.out.println(s2);
				
	}

}
