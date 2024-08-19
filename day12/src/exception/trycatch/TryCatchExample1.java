package exception.trycatch;

public class TryCatchExample1 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		// int j = 5;
		
		try { // 예외가 발생할 수 있는 구문 기입
			System.out.println(i / j); // 예외 발생 가능성 존재
			System.out.println("예외 발생하지 않을 때만 실행됨");
			
		} catch(Exception e) { // catch 블럭에는 Exception의 종류를 기입
			System.out.println("0으로 나눠서 catch 블럭으로 넘어왔습니다.");
			
		} finally { // try, catch 둘 중 어느블럭이라도 실행되면 마무리 블럭 실행
			System.out.println("어쨌든 잘 마무리 했습니다.");
		}
		System.out.println("프로그램 종료!");
	}
}
