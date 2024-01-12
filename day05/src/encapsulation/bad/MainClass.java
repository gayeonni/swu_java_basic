package encapsulation.bad;

// fool proof가 되지 않아 bad case
public class MainClass {
	
	public static void main(String[] args) {
		
		// 같은 패키지 내부 클래스 파일을 가져다 쓸 때는 import 구문이 필요 없다.
		MyBirthday b = new MyBirthday();
		
		b.year = 2024;
		b.month = 13; // 잘못된 정보를 기입할 수 있다.
		b.day = 32; // 잘못된 정보를 기입할 수 있다.
		
		b.showDateInfo();
	}
	

}
