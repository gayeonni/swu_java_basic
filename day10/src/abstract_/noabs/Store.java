package abstract_.noabs;

public class Store extends PopupStore{
	
	@Override
	public void orderApple() {
		System.out.println("착즙 사과주스를 팝니다. 가격은 20000원입니다.");
	}
	
	@Override
	public void orderOrange() {
		System.out.println("착즙 오렌지주스를 팝니다. 가격은 20000원입니다.");
	}

	// 실수로 포도주스 가격 업데이트 누락
//	@Override
//	public void orderGrape() {
//		System.out.println("착즙 포도주스를 팝니다. 가격은 20000원입니다.");
//	}

}
