package day02;

public class IntegerExample {

	public static void main(String[] args) {
		int maxInt = 2147483647;
	    // 01111111 11111111 11111111 11111111 양수의 최댓값
		// 00000000 00000000 00000000 00001010 양수의 최댓값에 10을 더함
		// 1~~~~~~~ ~~~~~~~~ ~~~~~~~~ ~~~~~~~~ 결과는 음수
		
		System.out.println(maxInt + 10);

		int minInt = -2147483648;
		// 마찬가지의 맥락으로 최저에서 1을 빼면 최댓값으로 바뀐다.
		
		System.out.println(minInt - 1);
	}

}
