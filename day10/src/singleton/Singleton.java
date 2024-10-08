package singleton;

public class Singleton {
	/* 
	 * 싱글턴 패턴 - 객체를 1개만 만들어 유지하기 위한 디자인 패턴
	 * 1. 외부에서 생성자를 사용할 수 없도록 생성자에 private을 붙인다
	 */
	private Singleton() {}
	
	/*
	 * 2. 자신의 클래스 내부에서 스스로의 객체 1개를 생성한다.
	 * 이때, 멤버변수는 힙에 할당된 객체 없이 쓸 수 있도록 static이다.
	 */
	private static Singleton instance;
	
	static {
		instance = new Singleton();
	}
	
	/*
	 * 3. 외부에서 이 클래스의 객체를 필요로 하는 경우
	 * 2번에서 static으로 생성된 객체의 주소를 return한다.
	 */
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
