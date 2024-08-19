package api.lang.object;

public class ObjectInformaion {
	// toString 오버라이딩 후
	// System.out.println() 등으로 객체변수 조회 시
	// 해당 인스턴스의 클래스 경로와 주소값 대신
	// toString에서 리턴한 문자가 콘솔에 찍힌다.
	
	@Override
	public String toString() {
		return "조회 시 출력 문자";
	}
}
