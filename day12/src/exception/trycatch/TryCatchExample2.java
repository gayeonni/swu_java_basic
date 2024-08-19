package exception.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		// 어떤 종류가 되었건 직접 예외가 발생할 수 있는 구문을 작성한 다음
		// try~catch를 이용해 예외 발생시 처리되도록 프로그래밍하기
		// 0으로 나누기를 제외한 나머지를 이용하기
		String str = "JAVA";
		int integer = 10;
		
		try {
			System.out.println(Integer.parseInt(str) + 10);
		} catch(Exception e){
			System.out.println("알파벳은 정수로 변환할 수 없습니다.");
		} finally {
			System.out.println("예외문 종료");
		}
		System.out.println("프로그램 종료");
	}

}
