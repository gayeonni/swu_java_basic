package static_;

public class MainClass {

	public static void main(String[] args) {
		// 인스턴스 생성 전부터 이미 조회 가능한 팀점수
//		System.out.println(Asean.presentationScore);
		
		// 스태틱 메서드도 스태틱 변수처럼 객체 생성 이전에 할당된다.
		Asean.showPresentationScore();
		
		// 학생 4명 생성
		Asean a1 = new Asean("춘식이", 5, 30);
		Asean a2 = new Asean("라이언", 7, 20);
		Asean a3 = new Asean("콘", 6, 18);
		Asean a4 = new Asean("무지", 8, 22);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();

		// 어떤 인스턴스를 활용해도 팀 점수 조회가 가능하다.
//		System.out.println(a1.presentationScore); // 변수가 private이 되면 호출 불가능해진다.
//		System.out.println(a2.presentationScore);
//		System.out.println(a3.presentationScore);
//		System.out.println(a4.presentationScore);
	}

}
