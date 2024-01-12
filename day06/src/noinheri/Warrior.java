package noinheri;

public class Warrior {
	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// 생성자 정의
	// id만 입력 받는다.
	// hp 20, atk 3, def 1, exp 0
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	// 캐릭터 상태가 조회 가능한 showStatus()
	// 이 메서드는 멤버변수 정보를 콘솔에 출력한다.
	public void showStatus() {
		System.out.println("아이디: " + this.id);
		System.out.println("체력: " + this.hp);
		System.out.println("공격력: " + this.atk);
		System.out.println("방어력: " + this.def);
		System.out.println("획득 경험치: " + this.exp);
		System.out.println("-------------------------------------");
	}
	
	// 단독 사냥 메서드
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {
			System.out.println("이미 죽은 토끼입니다.");
			return; // 죽은 토끼에 대해서는 추가 로직이 필요 없다.
		}
		// 1. 내가 공격한 토끼의 체력을 3 깎는다.
		rabbit.setHp(rabbit.getHp() - this.atk);
		// 2. 방금 공격으로 죽었다면 경험치 5 증가
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
		} else {
			System.out.println("토끼를 공격했습니다.");
		}
	}
	
	// huntRat 메서드 구현
	// Rat은 공격을 받고 죽지 않으면 1회 반격한다.
	// 경험치는 80이다.
	public void huntRat(Rat rat) {
		if(rat.getHp() <= 0) {
			System.out.println("이미 죽은 쥐입니다.");
			return;
		}
		
		rat.setHp(rat.getHp() - this.atk);
		this.hp -= rat.getAtk();
		
		if(rat.getHp() <= 0) {
			System.out.println("쥐를 죽였습니다.");
			this.exp += 80;
		} else {
			System.out.println("쥐를 공격했습니다.");
			
		}
	}
}
