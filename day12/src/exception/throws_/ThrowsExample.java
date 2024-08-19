package exception.throws_;

public class ThrowsExample {

	public static String[] greetings = {"안녕", "싸웠다", "헬로"};
	
	/*
	 * 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
	 * 메모리 영역이 다르므로 예외처리를 메서드 호출지역으로 떠넘겨줘야 한다.
	 * 이를 throws라고 하고, 메서드 혹은 생성자 호출 시 예외처리를 강요할 때 사용한다.
	 */
	
	// throws 오른쪽 종류 예외가 터지면 호출부(이 예제에서는 main)에게 처리를 떠넘기게 된다.
	public static void greet(int idx) throws Exception {
		// 메서드 안에 try~catch문을 사용할 수는 있지만 너무 복잡하고
		// 객체지향적이지 않다.
		// try {
			System.out.println(greetings[idx]);
		// } catch(ArrayIndexOutOfBoundsException e) {
			
		// }
	}
	
	public static void main(String[] args) {
		// throws가 붙어있는 메서드나 생성자 호출 시에는
		// 해당 메서드를 try 블록 내부에서 호출해야 예외처리를 진행해준다.
		// greet(3); // 3이 없는데 3 호출 
		// throws를 작성하니 greet(3);에 밑줄 발생 -> try~catch문 작성 필요
		
		try {
			greet(3);
		} catch(Exception e) {
			// .printStackTrace()는 예외발생 경로를 추적하는 메시지를 출력한다.
			// 주로 개발 과정에서 예외의 원인을 역추적할 때 유용하다.
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}

}
