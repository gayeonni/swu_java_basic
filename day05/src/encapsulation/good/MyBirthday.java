package encapsulation.good;

public class MyBirthday {
	// 캡슐화(은닉)시 변수는 무조건 private로 처리
	private int year;
	private int month;
	private int day;
	
	// alt + shift + s 혹은 마우스 우클릭 -> source
	// >> generate constructor using fields 선택
	public MyBirthday(int year, int month, int day) {
		this.year = year;

//		다음과 같이 작성할 시 값 대입, 검증이 가능하지만
//		로직에 문제가 발생할 경우 어느 부분이 문제인지 확인하기 비교적 어렵다.
//		리팩토링: 기능은 유지하면서 코드의 구조를 유지보수하기 좋게 개선하는 것
//		if(month < 1) {
//			this.month = 1;
//		} else if(month > 12) {
//			this.month = 12;
//		} else {
//			this.month = month;
//		}
		
		setMonth(month);
		setDay(day);
		
	}
	
	// 은닉된 변수에 접근하기 위해서는
	// 클래스 설계시 미리 설정해둔 setter/getter 메서드를 이용해
	// 데이터에 접근해야 한다.
	
	// setter 메서드 선언
	// 1. setter 메서드는 은닉변수에 값을 저장(세팅)하기 위해 선언한다.
	// 2. 메서드의 접근 제한자는 public으로 설정한다.
	// 3. 이름은 일반적으로 set+변수명으로 지정한다.
	private void setDay(int day) {
		if(day < 1 || day > 31) {
			this.day = 1; // 범위를 벗어나는 값이 들어오면 1로 고정
		} else {
			this.day = day; // 범위 내의 값은 그대로 적용
		}
	}
	
	// setMonth를 설계해서 1~12중 하나만 받아서 저장하게 하기.
	private void setMonth(int month) {
		if(month < 1) {
			this.month = 1;
		} else if(month > 12) {
			this.month = 12;
		} else {
			this.month = month;
		}
	}
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println("이니까 선물 주세요.");
		
	}
}
