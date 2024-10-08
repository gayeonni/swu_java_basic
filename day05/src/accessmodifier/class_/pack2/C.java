package accessmodifier.class_.pack2;

import accessmodifier.class_.pack1.B;

public class C {
	
	// 클래스 B는 public 클래스이므로 패키지가 달라도 생성 가능
	// 패키지가 다른 경우에는 import 구문을 선언해야 한다.
	B b = new B();
	
	// 클래스 A는 default 접근제한자를 적용받은 클래스이므로 패키지가 다르면 호출 불가능
	// 참조도 불가능하다.
	// A a = new A();
}
