package super_;

public class Airplane {
	public String planeCode; 
	protected int speed;
	public int gas;
	
	// 속도 0, 연료 100으로 고정, 편명만 입력받는 생성자 정의
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		speed = 0;
		gas = 100;
	}
	
	// 최대속도를 900으로 설정하는 메서드 fly 정의
	// 호출시 연료는 3씩 차감, 속도는 100씩 증가한다.
	public void fly() {
		if(this.gas - 3 < 0) {
			System.out.println("연료 부족으로 가속 불가능");
			return;
		}
		
		if(this.speed + 100 >= 900) {
			speed = 900;
			gas -= 3;
			return;
		}
		
		this.speed += 100;
		this.gas -= 3;
	}
	
	// 계기판 보는 메서드
	public void showStatus() {
		System.out.println("편명: " + this.planeCode);
		System.out.println("속력: " + this.speed);
		System.out.println("연료: " + this.gas);
	}
}
