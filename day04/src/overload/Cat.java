package overload;

public class Cat {
	
	public String name;
	public String kind;
	
	// void 생성자
	public Cat() {
		name = "이름을 입력하지 않았습니다.";
		kind = "품종이 확인되지 않았습니다.";
		
	}
	
	// String, String 생성자 (생성자 오버로딩)
	public Cat(String n, String k) {
		name = n;
		kind = k;
		System.out.println("지금부터 이 아이의 이름은 " + name + "입니다.");
	}
	
	// void 메서드
	public void Call() {
		System.out.println(name + "아 이리와");
	}
	
	// String 메서드 (메서드 오버로딩)
	public void Call(String callName) {
		System.out.println(callName + "아 이리와");
	}

}