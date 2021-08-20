
public class Hero extends Character {
//	String name; //이름
//	int lev; //레벨
//	int hp;  //hp
//	int str; //str
//	int def; //def
//	int exp; //exp
//	int gold; //gold	
//	public int attackedDamage(int damage) { //공격 받은 데미지
//		return damage - def;
//	}	
	String className;

	public void showStatus() {
	}

	public void useGold(int entirePrice) { // 돈을 사용하는 메서드
		if ((this.gold - entirePrice) > 0) { // 만약 객체의 골드가 전체 가격보다 많다면
			this.gold = this.gold - entirePrice;
		}
		if ((gold - entirePrice) < 0) { // 만약 객체의 골드가 전체 가격보다 적다면.
			System.out.println("골드가 부족합니다.");
		}
	}

	public int attack() {
		return 0;
	}
	
	public void attacked(int damageTaken) {
	}
}
