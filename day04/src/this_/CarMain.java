package this_;

public class CarMain {

	public static void main(String[] args) {
		// 자동차 2대를 만들어보자
		Car myCar = new Car("멋진차");
		Car yourCar = new Car("차차");
		
		for(int i = 0; i < 20; i++) {
			myCar.accel();
		}
		myCar.showStatus();
		
		yourCar.accel();
		yourCar.showStatus();

	}

}
