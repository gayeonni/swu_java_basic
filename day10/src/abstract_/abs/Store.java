package abstract_.abs;

public class Store extends PopupStore{

	@Override
	public void orderApple() {
		System.out.println("착즙사과주스를 20000원에 팝니다");
		
	}

	@Override
	public void orderOrange() {
		System.out.println("착즙오렌지주스를 20000원에 팝니다");
		
	}

	@Override
	public void orderGrape() {
		System.out.println("착즙포도주스를 20000원에 팝니다");
		
	}

}
