package class_;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		// 농구선수 2명을 만들어주시고 정보를 조회하는 코드를 작성해주세요.
		BasketballPlayer b1 = new BasketballPlayer("농선", 190, 20, 100000000);
		// b1.name = "농선";
		// b1.height = 190;
		// b1.age = 20;
		// b1.salary = 1000000000;
		
		BasketballPlayer b2 = new BasketballPlayer("구수", 200, 22, 200000000);
		// b2.name = "구수";
		// b2.height = 200;
		// b2.age = 22;
		// b2.salary = 2000000000;
		
		b1.showInfo();
		b1.dunkShoot();
		
		b2.showInfo();
		b2.dunkShoot();

	}

}