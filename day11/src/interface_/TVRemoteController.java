package interface_;

public class TVRemoteController implements RemoteController {

	private final int inch;
	private int channel;
	
	public TVRemoteController(int inch) {
		this.inch = inch;
		this.channel = 1;
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void showStatus() {
		System.out.println("화면크기: " + this.inch);
		System.out.println("현재채널: " + this.channel);
		
	}
	
	public void setChanneldown() {
		// 1번까지만 채널이 있다.
		if(this.channel - 1 < 1) {
			this.channel = 1;
		} else {
			this.channel--;
		}
	}
	
	public void setChannelup() {
		this.channel++;
	}

}
