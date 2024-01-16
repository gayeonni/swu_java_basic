package interface_;

public interface RemoteController {
	
	// 최대 배터리량, 최소 배터리량을 상수로 지정
	int MAX_BATTERY = 100;
	int MIN_BATTER = 0;
	
	// 리모콘이 가져야 하는 필수 기능에 대해 정의
	public void turnOn();
	public void turnOff();
	public void showStatus();

}
