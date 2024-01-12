package noinheri;

public class Rabbit {

	// 토끼 몬스터를 만든다.
	// 토끼는 hp, atk, def를 갖는다.
	private int hp;
	private int atk;
	private int def;
	
	// 생성자에서 void 파라미터로 각각 3, 0, 0으로 초기화
	public Rabbit() {
		this.hp = 3;
		this.atk = 0;
		this.def = 0;
	}

	// setter / getter 자동생성
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	
	
}
