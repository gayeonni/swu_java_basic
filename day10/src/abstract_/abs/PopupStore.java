package abstract_.abs;

public abstract class PopupStore {

	/*
	 * 1. 메서드에 abstract를 붙이면 해당 메서드는 추상메서드가 되고
	 * 이 메서드에는 반드시 오버라이딩 해야 한다.
	 * 2. 추상 메서드는 상속을 목적으로 선언한 메서드이지 실행을 목적으로
	 * 선언된 메서드가 아니므로 메서드의 몸체({})부분이 없고
	 * 선언 마무리도 세미콜론으로 해야 한다.
	 * 3. 일반 클래스에는 추상 메서드를 선언할 수 없다.
	 * 추상메서드가 하나 이상 존재하면 무조건 추상클래스로 선언해야 한다.
	 * 4. 추상클래스 내부에서는 추상메서드가 하나 이상으로 존재한다면 일반 메서드 선언도 가능하다.
	 */
	
	public abstract void orderApple();
	public abstract void orderOrange();
	public abstract void orderGrape();
	
	public void refund() {
		System.out.println("제품에 문제가 있어서 환불합니다.");
	}
}
