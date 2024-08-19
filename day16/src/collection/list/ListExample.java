package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// ArrayList와 LinkedList는 사용 양식은 전부 List 인터페이스를 따른다.
		// 따라서 교환이 가능하다.
		// 인터페이스가 같은 구현체들은 사용법이 모두 같다.
		// 제네릭: 타입 안정화를 위해 객체 내부에 저장되는 타입을 일치시키는 방법
		// String만 저장할 수 있는 컬렉션
		
		// 다형성이 적용되는 특정 인터페이스 타입에 구현체를 선택적으로 대입하는 패턴을 전략패턴이라고 한다.
		List<String> list = new ArrayList<>(); // 1.8버전부터는 생성자에 제네릭 표시 X
//		List<String> list = new LinkedList<>(); 위와 동일하게 사용 가능
		
		String str1 = "Java";
		String str2 = "SpringBoot";
		System.out.println(list); // 컬렉션들은 toString()이 자동으로 오버라이딩되어
								  // 주소값이 아닌 내부 저장 요소가 바로 콘솔에 찍힘
		// list에 객체를 저장하는 메서드 add(): 데이터를 마지막 지점에 추가
		list.add(str1);
		list.add(str2);
		list.add("infra");
		list.add("docker");
		list.add("linux");
		list.add("linux"); // 중복 저장 허용
		System.out.println(list);
		
		// list에 저장된 총 객체 수 얻기 .size()
		int size = list.size();
		System.out.println("list에 저장된 총 객체의 수: " + size);

		// list에 객체 삽입 add(index, 객체): 데이터를 해당 인덱스 번호에 넣고
		// 해당 인덱스 이후 자료는 전부 한 칸씩 뒤로 밀어내기
		list.add(2, "Network");
		System.out.println(list);
		
		// list 데이터 수정 set(index, 객체)
		// list[5] = "ubuntu"; // 일반 인덱싱으로 수정하기 사용 불가
		list.set(5, "ubuntu");
		System.out.println(list);
		
		// list 내부 객체 가져오기 get(index)
		String s = list.get(2);
		System.out.println(s);
		
		// list 내부에 저장된 객체의 번호가 몇 번인지 확인하기
		int idx = list.indexOf("docker");
		System.out.println(idx);
		
		// list에서 객체데이터 삭제 remove(index), remove(객체)
		list.remove(5);
		System.out.println(list);
		list.remove(str1);
		System.out.println(list);
		
		// list 내부에 저장된 객체의 유무확인 contains() -> 있으면 true, 없으면 false
		System.out.println(list.contains(str2));
		
		// list의 반복문 처리
		// 인덱스로 조회
		for(int i = 0; i < list.size(); i++) {
			System.out.println("내부요소: " + list.get(i));
		}
		System.out.println("-----------------");
		
		// 향상된 for문도 사용 가능(List<String>으로 선언했으므로 String으로 받기)
		for(String str : list) {
			System.out.println("내부요소 " + str);
			
		}
		
		// list 내부의 전체 자료 삭제 clear()
		list.clear();
		
		// list 내부 데이터가 전부 비었는지 확인하는 메서드 isEmpty()
		System.out.println(list.isEmpty());
	}
	


}
