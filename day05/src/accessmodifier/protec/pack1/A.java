package accessmodifier.protec.pack1;

public class A {
	
	// protected는 다른 패키지일지라도 양 클래스가 부모, 자식 관계라면
	// 제한적으로 접근을 허용한다.
	protected String s;
	
	protected A() {} // 생성자
	
	protected void method() {}
}
