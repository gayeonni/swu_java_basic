package accessmodifier.constructor.pack2;

import accessmodifier.constructor.pack1.A;

public class C {

	// A a1, a2, a3를 선언하고 각각 다른 생성자로 호출해서
	// 접근 제한자별 차이를 생각해보자.
	A a1 = new A(true); // public 생성자 호출 가능
	// A a2 = new A(20); // default 생성자 호출 불가능
	// A a3 = new A("안녕"); // private 생성자 호출 불가능
}
