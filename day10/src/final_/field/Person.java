package final_.field;

public class Person {
	
	/*
	 * final 변수는 단 한 번 초기화될 수 있고
	 * 이후에는 변경이 불가능하기 때문에
	 * 선언 시에 아예 직접 초기화를 해주거나
	 * 혹은 생성자에서 초기화를 해줘야 한다.
	 */
	public final String nationality = "대한민국";
	public final String name; // 선언부 초기화를 안 하면 생성자 초기화 필요
	public int age; // final이 없는 멤버변수는 초기화하지 않아도 된다.
	
	public Person(String name) {
		this.name = name;
	}
}
