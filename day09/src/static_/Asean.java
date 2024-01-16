package static_;

public class Asean {
	public String name;
	private int attendanceScore; // 출결점수
	private int finalTermScore; // 기말점수
	
	// public static int presentationScore; // 29 변수용
	private static int presentationScore; // 29 메서드용
	
	// presentationScore 빼고 초기화
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
	}
	
	// 스태틱 블록 내부 코드는 프로그램 시작 시 즉시 자동으로 한 번 호출된다.
	static { // static은 this를 사용하지 못한다.
		presentationScore = 29;
	}
	// 스태틱 메서드도 객체 없이 바로 호출 가능하다.
	public static void showPresentationScore() {
		System.out.println(presentationScore);
	}
	
	// 이 메서드는 객체 생성하고 나서 사용 가능한 메서드.
	public void showStudentScore() {
		System.out.println("학생명: " + this.name);
		System.out.println("출석 점수: " + this.attendanceScore);
		System.out.println("발표 점수: " + presentationScore);
		System.out.println("기말 점수: " + this.finalTermScore);
		System.out.println("최종성적: " + (this.attendanceScore + presentationScore + this.finalTermScore));
		System.out.println("---------------------------");
	}
}
