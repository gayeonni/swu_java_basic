package exception.custom;

public class MainClass {

	public static void main(String[] args) {
		Account acc = new Account();
		
		try {
			acc.deposit(-50);
			System.out.println("입금 후 잔액: " + acc.getBalance() + "원");
			acc.withdraw(1000000);
		} catch(BalanceInsufficientException e) {
			// 예외 클래스가 제공하는 getMessage() 메서드는 예외의 원인 메세지를
			// String 타입으로 리턴한다. 자바 표준 API에서 제공하는 다양한 예외 클래스들은
			// 각각의 예외 원인 메세지가 기본적으로 객체 안에 저장되어 있다.
			e.printStackTrace();
								// 생성자에서 제공해준 메세지를 그대로 출력
			System.err.println(e.getMessage());
		} catch (DepositMinusMoneyException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		System.out.println("출금 후 잔액: " + acc.getBalance() + "원");
	}

}
