package singleton;

public class MainClass {

	public static void main(String[] args) {
		// Singleton 객체는 생성자가 private이므로 인스턴스 생성 불가
		// Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1의 레퍼런스: " + s1);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2의 레퍼런스: " + s2);

	}

}
