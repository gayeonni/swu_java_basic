package exception.trycatch;

// 예외문이 없었을 때는 제어문으로 결과 제어
// 문제점: 가독성이 좋지 않다.
public class NoTryCatchExample {
	public static void main(String[] args) {
		int preValue = 5;
		int nextValue = 0;
		
		// nextValue에 0만 안 들어오면 예외 발생 없음
		if(nextValue != 0) {
			System.out.println(preValue / nextValue);
		} else {
			System.out.println("0을 나누는 값으로 넣을 수 없습니다.");
		}
	}
}
