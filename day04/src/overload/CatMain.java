package overload;

public class CatMain {
	public static void main(String[] args) {
		// void 생성자로 생성한 고양이
		Cat c1 = new Cat();
		
		System.out.println(c1.name);
		System.out.println(c1.kind);
		
		c1.Call();
		c1.Call("야옹이");
		System.out.println("-------------------");
		
		Cat c2 = new Cat("춘식", "코숏");
		
		System.out.println(c2.name);
		System.out.println(c2.kind);
		
		c2.Call();
		c2.Call("춘식");
		System.out.println("-------------------");
	}

}
