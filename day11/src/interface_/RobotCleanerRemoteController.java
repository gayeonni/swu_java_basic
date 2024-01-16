package interface_;

public class RobotCleanerRemoteController implements RemoteController {

	public String modelName;
	public String price;
	
	// 로봇청소기 생성자
	public RobotCleanerRemoteController(String modelName, String price) {
		this.modelName = modelName;
		this.price = price;
	}
	
	@Override
	public void turnOn() {
		System.out.println("로봇청소기를 킨다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("로봇청소기를 끈다.");
		
	}

	@Override
	public void showStatus() {
		System.out.println("모델명: " + this.modelName);
		System.out.println("가격: " + this.price);
		
	}

}
