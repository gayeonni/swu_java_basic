package instanceof_;

public class MainClass {

	public static void main(String[] args) {
		// Human, Student, Cat 인스턴스 생성
		Human h1 = new Human("자바", 20);
		h1.showInfo();
		
		Student s1 = new Student("학생", 15);
		s1.showInfo();
		
		Cat c1 = new Cat("춘식이", 5);
		c1.meow();
		
		System.out.println(h1 instanceof Student); // h1이 Human 객체(인스턴스)인가
		System.out.println(s1 instanceof Human); // s1이 Human 객체(인스턴스)인가

	}

}
