package overload;

public class HumanMain {

	public static void main(String[] args) {
		// Human을 생성하되 하나는 void 생성자로
		// 다른 하나는 (Stirng, int) 생성자를 사용하기
		Human h1 = new Human();
		System.out.println("사람의 이름: " + h1.name);
		System.out.println("사람의 나이: " + h1.age);
		
		Human h2 = new Human("춘식이", 5);
		System.out.println("사람의 이름: " + h2.name);
		System.out.println("사람의 나이: " + h2.age);

	}

}
