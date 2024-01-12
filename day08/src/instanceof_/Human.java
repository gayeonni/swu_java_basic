package instanceof_;

public class Human {

	private String name;
	private int age;
	
	// 생성자 정의
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// void 파라미터로 생성자 호출 시
	public Human() {
		// this.name = "noname";
		// this.age = 0;
		this("noname", 0);
	}
	
	
	public void showInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("-----------------");
	}
}
