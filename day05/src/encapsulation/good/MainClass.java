package encapsulation.good;

public class MainClass {
	public static void main(String[] args) {
		// 12월 32일 같은 없는 날짜를 걸러주는지 체크하기
		MyBirthday b = new MyBirthday(2024, 120, 50);
		// b.day = 50; // private이므로 외부인 Main에서 직접 주입 불가능
		b.showDateInfo();
	}
}