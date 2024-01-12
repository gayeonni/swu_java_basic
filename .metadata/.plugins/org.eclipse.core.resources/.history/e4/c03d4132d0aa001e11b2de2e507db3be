package basic.importex;

import basic.fruit.Apple;
import basic.hello.bye.Bye;
import basic.hello.hi.Hi;

/*
 * 같은 프로젝트 내의 코드끼리나 혹은 자바에서 기본으로 제공하는 클래스파일은 
 * 언제든지 가져다가 사용할 수 있습니다.
 * 다만 다른 패키지에 있는 클래스를 사용하려면 반드시 package 선언부 아래
 * (1번 라인 아래)에 import 선언을 통해 참조할 클래스의 경로를 적어야 합니다.
 * ex) import java.util.Date; <- Date 클래스를 참조하는 경로
 */

public class ImportExample {

	public static void main(String[] args) {
		// 같은 패키지 내의 다른 클래스를 호출할 때는 어떤 참조설정도 필요하지 않다.
		Test test = new Test(); 
		Apple apple = new Apple(); 
		// 나머지 과일 하나와, Hi, Bye도 같은 맥락으로 작성하면서
		// 자동완성을 통해 상단에 import되는 구문을 보며
		// 외부 패키지를 어떤식으로 참조하는지 직접 확인하세요.
		Hi hi = new Hi();
		Bye bye = new Bye();

	}

}
