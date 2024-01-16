package abstract_.templatemethod;

public abstract class Lottery {

	// 템플릿 메서드 패턴은 큰 틀에서 호출구문은 구현메서드(실행문이 있는 메서드)
	// 로 정의하고 구현메서드가 호출하는 추상메서드들은 상속 후에 특징을 정하도록
	// 만들어서 호출 순서는 그대로 가져갈 수 있도록 하되
	// 사용자가 특징만 정의하도록 하는 디자인 패턴이다.
	
	// 구현메서드에는 큰 틀은 같지만 세부사항이 달라질 수 있는 내용을 먼저 작성한다.
	public final void lotteryCycle() { // final 이므로 오버라이딩 불가. 순서 고정
		// 1. 복권 구매 
		buyLottery();
		// 2. 당첨 여부 확인
		checkWinLottery();
		// 3. 당첨금 수령
		getLotteryMoney();
	}
	
	// 세부사항은 상속받은 주체가 무엇인지에 따라 다르게 정의할 수 있도록
	// 추상메서드만 정의해놓고 추가적인 작업은 하지 않는다.
	abstract void buyLottery();
	abstract void checkWinLottery();
	abstract void getLotteryMoney();
}
