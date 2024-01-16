package abstract_.noabs;

public class MainClass {

	public static void main(String[] args) {
		// 2가지 문제점
		
		// 1. 정식 매장이 존재하는데 팝업스토어 생성 가능
		PopupStore ps = new PopupStore();
		
		// 2. 팝업스토어 클래스 내부에서 오버라이딩이 필수인 메서드가 누락될 수도 있음
		// 부모타입으로 promotion 됐기 때문에 s가 사용 가능한 영역은 PopupStore
		PopupStore s = new Store();
		s.orderApple(); // 사과주스 가격 책정됨
		s.orderOrange(); // 오렌지주스 가격 책정됨
		s.orderGrape(); // 포도주스 가격 누락됨


	}

}
