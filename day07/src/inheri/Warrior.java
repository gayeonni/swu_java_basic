package inheri;

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
	
	// 파라미터로 모든 몬스터의 부모타입인 Monster 인스턴스를 요구하면
	// 다형성 원리에 의해 상속받은 모든 몬스터를 다 대입할 수 있다.
	public void hunt(Monster monster) {
		
		// 죽은 몬스터는 교전 불가 및 메서드 즉시 종료
		if(monster.getHp() <= 0) {
			System.out.println(monster.getName() + "은(는) 이미 죽어서 교전할 수 없습니다.");
			return;
		}
		// 다음 공격으로 몬스터가 죽는 경우
		if(monster.getHp() - (this.atk - monster.getDef()) <= 0) {
			// 몬스터 hp 0, 경험치 부여
			monster.setHp(0);
			System.out.println(monster.getName() + "이(가) 죽었습니다.");
			this.exp += monster.getExp();
		} else { // 다음 공격으로 몬스터가 죽지 않아 반격하는 경우
					
			// 몬스터 체력 차감
			monster.setHp(this.atk - monster.getDef());
			
			// 내 체력 차감
			this.hp -= monster.getAtk() - this.def;
			System.out.println(monster.getName() + "이(가) 반격했니다.");
			
		}
		
		
	}
}
