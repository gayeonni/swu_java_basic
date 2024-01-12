package class_;

public class CatMain {

	public static void main(String[] args) {
		// 고양이 2마리 생성
		Cat c1 = new Cat();
		c1.name = "야옹이";
		c1.age = 2;
		c1.kind = "페르시안";
		c1.color = "흰색";
		
		Cat c2 = new Cat();
		c2.name = "춘식이";
		c2.age = 5;
		c2.kind = "코숏";
		c2.color = "치즈";
		
		c1.showCatInfo();
		c2.showCatInfo();

	}

}
