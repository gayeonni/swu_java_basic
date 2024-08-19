package api.lang.string;

public class StringSubstring {
	public static void main(String[] args) {
		// 주민번호 양식
		String ssn = "121230-4568137";
		System.out.println(ssn);
		
		// substring() 메서드에 매개값으로 인덱스를 1개 지정 시
		// 해당 인덱스부터 마지막 지점까지의 문자를 추출한다.
		String last = ssn.substring(7);
		System.out.println(last);
		
		// substring() 메서드에 매개값으로 인덱스를 2개 지정 시
		// 첫 번째 매개값 이상, 두 번째 매개값 미만 범위 문자를 추출한다.
		String first = ssn.substring(0, 6); // 0번 이상 6번 미만
		System.out.println(first);
	}
}
