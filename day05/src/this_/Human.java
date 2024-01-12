package this_;

public class Human {

	public String name;
	public int age;
	
	// 생성자 선언을 해주시되 name, age를 입력받아 대입해 주세요.
	// 변수 이름은 name, age로 해주세요.
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메서드 오버로딩으로 이름만 입력받는 생성자 정의
	public Human(String name) {
		this(name, 0); // 다른 생성자 호출
		// this.name = name;
		// age = 0;
	}
	
	// 아무것도 입력하지 않았을 때 name에는 "이름없음", age에는 -1이 대입되는
	// void 생성자를 정의해 주세요.
	// 모든 필드값을 대입하는 구문과 this()를 사용하는 경우 모두 작성하세요.
	public Human() {
		this("이름 없음", -1); // 다른 생성자 호출
		// name = "이름 없음";
		// age = -1;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}
