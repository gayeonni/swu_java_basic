package override;

public class OverrideExample {

	public static void main(String[] args) {
		// 프로그래머 클래스의 인스턴스를 생성해주세요.
		Programmer p1 = new Programmer();
		
		// 해당 인스턴스의 값을 대입해주세요.
		p1.name = "김개발";
		p1.age = 27;
		p1.duty = "백엔드";
		p1.repoCount = 45;
		
		// 자기소개와 코딩을 시켜보세요.
		p1.자기소개하기();
		p1.코딩하기();
	}

}